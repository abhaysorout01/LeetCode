class Solution {
    public static void qn(int n, int col, int[] leftrow,int[] upd,int[] dd,List<List<String>> ans,char[][] chr) {
        if(col == n) {
            List<String> list = new ArrayList<>();
            for(char[] c : chr) list.add(new String(c));
            ans.add(list);
            return;
        }
        for(int j = 0;j < n;j++) {
            if(leftrow[j] == 0 && upd[col - 1 - j + n] == 0 && dd[col + j] == 0) {
                chr[j][col] = 'Q';
                leftrow[j] = 1;
                upd[col - 1 - j + n] = 1;
                dd[col + j] = 1;
                qn(n,col+1,leftrow,upd,dd,ans,chr);
                chr[j][col] = '.';
                leftrow[j] = 0;
                upd[col - 1 - j + n] = 0;
                dd[col + j] = 0;
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] chr = new char[n][n];
        for(char[] ch : chr) Arrays.fill(ch, '.');
        qn(n,0,new int[n],new int[2 * n - 1],new int[2 * n - 1],ans,chr);
        return ans;
    }
}