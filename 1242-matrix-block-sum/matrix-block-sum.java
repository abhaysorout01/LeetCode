class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int[][] arr = new int[mat.length][mat[0].length];
        for(int i = 0;i < mat.length;i++) {
            for(int j = 0;j < mat[i].length;j++) {
                int sum = 0;
                for(int m = Math.max(0,i-k);m < Math.min(mat.length,i+k+1);m++) {
                    for(int n = Math.max(0,j-k);n < Math.min(mat[i].length,j+k+1);n++) {
                        sum += mat[m][n];
                    }
                }
                arr[i][j] = sum;
            }
        }
        return arr;
    }
}