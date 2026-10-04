class Solution {
    public int totalNQueens(int n) {
        HashSet<List<String>> set = new HashSet<>();
        char[][] board = new char[n][n];
        for(char[] ch : board) Arrays.fill(ch, '.');
        play(n,board,new int[n],new int[2 * n + 1],new int[2 * n + 1],0,set);
        return set.size();
    }
    public static void play(int n,char[][] board,int[] leftrow,int[] upd,int[] dd,int col,HashSet<List<String>> set) {
        if(col == n) {
            List<String> list = new ArrayList<>();
            for(char[] ch : board) list.add(new String(ch));
            set.add(list);
            return;
        }
        for(int row = 0;row < n;row++) {
            if(leftrow[row] == 0 && upd[row + col] == 0 && dd[n - row + col - 1] == 0) {
                board[row][col] = 'Q';
                leftrow[row] = 1;
                upd[row + col] = 1;
                dd[n - row + col - 1] = 1;
                play(n,board,leftrow,upd,dd,col+1,set);
                board[row][col] = '.';
                leftrow[row] = 0;
                upd[row + col] = 0;
                dd[n - row + col - 1] = 0;
            }
        }
    }
}