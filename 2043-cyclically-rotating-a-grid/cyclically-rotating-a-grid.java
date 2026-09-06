class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        for(int x = 0; x < Math.min(n, m) / 2; x++) {
            int rows = n - 2 * x;
            int cols = m - 2 * x;
            int len = 2 * (rows + cols) - 4;
            int rot = k % len;
            while(rot-- > 0) {
                int t = grid[x][x];
                for(int j = x; j < m - x - 1; j++) grid[x][j] = grid[x][j + 1];
                for(int i = x; i < n - x - 1; i++) grid[i][m - x - 1] = grid[i + 1][m - x - 1];
                for(int j = m - x - 1; j > x; j--) grid[n - x - 1][j] = grid[n - x - 1][j - 1];
                for(int i = n - x - 1; i > x + 1; i--) grid[i][x] = grid[i - 1][x];
                grid[x + 1][x] = t;
            }
        }
        return grid;
    }
}