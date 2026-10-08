package dsa.tree;

import dsa.common.TreeNode;

/**
 * Maximum Depth of Binary Tree (easy).
 *
 * <p>The maximum depth is the number of nodes along the longest path from the root down to the
 * farthest leaf.
 *
 * <p>Time: O(n) — each node is visited once.<br>
 * Space: O(h) recursion stack, where h is the tree height (O(n) worst case).
 */
public final class MaxDepthBinaryTree {
    private MaxDepthBinaryTree() {}

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
