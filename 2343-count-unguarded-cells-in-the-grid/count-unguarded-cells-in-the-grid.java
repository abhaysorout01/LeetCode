class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] arr = new int[m][n];
        for (int[] g : guards) arr[g[0]][g[1]] = 1;
        for (int[] w : walls) arr[w[0]][w[1]] = 2;

        for (int i = 0; i < m; i++) {
            boolean seenGuard = false;

            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) seenGuard = true;
                else if (arr[i][j] == 2) seenGuard = false;
                else if (seenGuard) arr[i][j] = -1;
            }
        }

        for (int i = 0; i < m; i++) {
            boolean seenGuard = false;
            for (int j = n - 1; j >= 0; j--) {
                if (arr[i][j] == 1) seenGuard = true;
                else if (arr[i][j] == 2) seenGuard = false;
                else if (seenGuard) arr[i][j] = -1;
            }
        }

        for (int j = 0; j < n; j++) {
            boolean seenGuard = false;
            for (int i = 0; i < m; i++) {
                if (arr[i][j] == 1) seenGuard = true;
                else if (arr[i][j] == 2) seenGuard = false;
                else if (seenGuard) arr[i][j] = -1;
            }
        }

        for (int j = 0; j < n; j++) {
            boolean seenGuard = false;
            for (int i = m - 1; i >= 0; i--) {
                if (arr[i][j] == 1) seenGuard = true;
                else if (arr[i][j] == 2) seenGuard = false;
                else if (seenGuard) arr[i][j] = -1;
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) count++;
            }
        }

        return count;
    }
}