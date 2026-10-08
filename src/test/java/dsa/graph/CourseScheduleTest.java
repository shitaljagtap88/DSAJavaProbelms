package dsa.graph;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CourseScheduleTest {

    @Test
    void linearPrereqsCanFinish() {
        assertTrue(CourseSchedule.canFinish(2, new int[][] {{1, 0}}));
    }

    @Test
    void twoCycleCannotFinish() {
        assertFalse(CourseSchedule.canFinish(2, new int[][] {{1, 0}, {0, 1}}));
    }

    @Test
    void noPrerequisites() {
        assertTrue(CourseSchedule.canFinish(3, new int[][] {}));
    }

    @Test
    void longerCycle() {
        assertFalse(CourseSchedule.canFinish(3, new int[][] {{0, 1}, {1, 2}, {2, 0}}));
    }
}
