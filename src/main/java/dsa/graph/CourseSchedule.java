package dsa.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Course Schedule (medium, BFS / Kahn's algorithm).
 *
 * <p>There are {@code numCourses} labeled {@code 0 .. numCourses-1}. Each prerequisite pair {@code
 * [a, b]} means you must take course {@code b} before course {@code a}. Return {@code true} if you
 * can finish all courses (the graph is a DAG), otherwise {@code false}.
 *
 * <p>Time: O(V + E).<br>
 * Space: O(V + E) for the adjacency list, indegrees, and queue.
 */
public final class CourseSchedule {
    private CourseSchedule() {}

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>(numCourses);
        int[] indegree = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : prerequisites) {
            int course = edge[0];
            int prereq = edge[1];
            adj.get(prereq).add(course);
            indegree[course]++;
        }

        Deque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        int taken = 0;
        while (!queue.isEmpty()) {
            int course = queue.removeFirst();
            taken++;
            for (int next : adj.get(course)) {
                indegree[next]--;
                if (indegree[next] == 0) {
                    queue.add(next);
                }
            }
        }
        return taken == numCourses;
    }
}
