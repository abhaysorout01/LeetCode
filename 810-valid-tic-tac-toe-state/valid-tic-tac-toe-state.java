class Solution {
    public boolean validTicTacToe(String[] board) {
        int first = 0;
        int second = 0;

        for(String s : board) {
            for(char ch : s.toCharArray()) {
                if(ch == 'O') second++;
                else if(ch == 'X') first++;
            }
        }

        if(first < second || first - second > 1) return false;

        boolean win1 = false;
        boolean win2 = false;

        for(int i = 0; i < 3; i++) {
            if(board[i].charAt(0) == 'X' && board[i].charAt(1) == 'X' && board[i].charAt(2) == 'X') win1 = true;
            if(board[i].charAt(0) == 'O' && board[i].charAt(1) == 'O' && board[i].charAt(2) == 'O') win2 = true;
        }
        for(int j = 0; j < 3; j++) {
            if(board[0].charAt(j) == 'X' && board[1].charAt(j) == 'X' && board[2].charAt(j) == 'X') win1 = true;
            if(board[0].charAt(j) == 'O' && board[1].charAt(j) == 'O' && board[2].charAt(j) == 'O') win2 = true;
        }
        if(board[0].charAt(0) == 'X' && board[1].charAt(1) == 'X' && board[2].charAt(2) == 'X') win1 = true;
        if(board[0].charAt(2) == 'X' && board[1].charAt(1) == 'X' && board[2].charAt(0) == 'X') win1 = true;
        if(board[0].charAt(0) == 'O' && board[1].charAt(1) == 'O' && board[2].charAt(2) == 'O') win2 = true;
        if(board[0].charAt(2) == 'O' && board[1].charAt(1) == 'O' && board[2].charAt(0) == 'O') win2 = true;
        if(win1 && first != second + 1) return false;
        if(win2 && first != second) return false;
        return true;
    }
}