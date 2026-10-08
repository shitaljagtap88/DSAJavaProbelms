package dsa.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class LevelOrderTraversalTest {

    @Test
    void visitsLevelByLevel() {
        assertEquals(
                List.of(List.of(3), List.of(9, 20), List.of(15, 7)),
                LevelOrderTraversal.levelOrder(Trees.of(3, 9, 20, null, null, 15, 7)));
    }

    @Test
    void emptyTree() {
        assertEquals(List.of(), LevelOrderTraversal.levelOrder(null));
    }

    @Test
    void singleNode() {
        assertEquals(List.of(List.of(1)), LevelOrderTraversal.levelOrder(Trees.of(1)));
    }
}
