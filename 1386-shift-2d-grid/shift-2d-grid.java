class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        k %= grid.length * grid[0].length;
        while(k > 0) {
            int[][] temp = new int[grid.length][grid[0].length];
            for(int i = 0;i < grid.length;i++) {
                for(int j = 0;j < grid[0].length;j++) {
                    if(j == 0) {
                        if(i == 0) temp[i][j] = grid[grid.length - 1][grid[0].length - 1];
                        else temp[i][j] = grid[i - 1][grid[0].length - 1];
                    }
                    else temp[i][j] = grid[i][j-1];
                }
            }
            grid = temp;
            k--;
        }
        List<List<Integer>> list = new ArrayList<>();
        for(int[] arr : grid) {
            List<Integer> t = new ArrayList<>();
            for(int n : arr) t.add(n);
            list.add(t);
        }
        return list;
    }
}