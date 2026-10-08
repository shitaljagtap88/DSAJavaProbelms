package dsa.tree;

import dsa.common.TreeNode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Binary Tree Level Order Traversal (medium).
 *
 * <p>Return the node values of a binary tree in level order (left to right, level by level).
 *
 * <p>Time: O(n).<br>
 * Space: O(n) for the queue and the output (a level can hold up to n/2 nodes).
 */
public final class LevelOrderTraversal {
    private LevelOrderTraversal() {}

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null) {
            return levels;
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.removeFirst();
                level.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            levels.add(level);
        }
        return levels;
    }
}
