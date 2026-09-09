class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;
        for(int i = 0; i < 4; i++) {
            boolean flag = true;
            for(int j = 0; j < n; j++) {
                for(int k = 0; k < n; k++) {
                    if(mat[j][k] != target[j][k]) {
                        flag = false;
                        break;
                    }
                }
            }
            if(flag) return true;
            int[][] temp = new int[n][n];
            for(int j = 0; j < n; j++) for(int k = 0; k < n; k++) temp[j][k] = mat[n - 1 - k][j];
            mat = temp;
        }
        return false;
    }
}