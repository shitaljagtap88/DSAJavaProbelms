package dsa.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import dsa.common.TreeNode;
import org.junit.jupiter.api.Test;

class MaxDepthBinaryTreeTest {

    @Test
    void balancedTree() {
        assertEquals(3, MaxDepthBinaryTree.maxDepth(Trees.of(3, 9, 20, null, null, 15, 7)));
    }

    @Test
    void emptyTree() {
        assertEquals(0, MaxDepthBinaryTree.maxDepth(null));
    }

    @Test
    void rightSkewed() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3)));
        assertEquals(3, MaxDepthBinaryTree.maxDepth(root));
    }
}
