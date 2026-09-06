class Solution {
    public int[][] largestLocal(int[][] grid) {
        int[][] mat = new int[grid.length - 2][grid.length - 2];
        int y = 0;
        while(y < grid.length - 2) {
            int x = 0;
            while(x < grid.length - 2) {
                int max = -1;
                for(int i = 0;i < 3;i++) {
                    for(int j = 0;j < 3;j++) {
                        max = Math.max(max,grid[x+i][y+j]);
                    }
                }
                mat[x++][y] = max;
            }
            y++;
        }
        return mat;
    }
}