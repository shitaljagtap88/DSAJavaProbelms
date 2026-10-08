package dsa.graph;

/**
 * Number of Islands (medium, DFS).
 *
 * <p>Given a 2D grid of {@code '1'} (land) and {@code '0'} (water), count the number of islands. An
 * island is a group of land cells connected 4-directionally (up/down/left/right).
 *
 * <p>Time: O(m · n) — each cell is visited a constant number of times.<br>
 * Space: O(m · n) worst-case recursion depth if the grid is one large island.
 */
public final class NumberOfIslands {
    private static final int[][] DIRS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    private NumberOfIslands() {}

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int islands = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == '1') {
                    islands++;
                    dfs(grid, r, c);
                }
            }
        }
        return islands;
    }

    private static void dfs(char[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] != '1') {
            return;
        }
        grid[r][c] = '0';
        for (int[] d : DIRS) {
            dfs(grid, r + d[0], c + d[1]);
        }
    }
}
