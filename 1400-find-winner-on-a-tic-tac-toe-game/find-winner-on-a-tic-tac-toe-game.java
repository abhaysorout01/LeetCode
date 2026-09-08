class Solution {
    public String tictactoe(int[][] moves) {
        char[][] arr = new char[3][3];
        for(int i = 0;i < moves.length;i++) {
            if(i % 2 == 0) arr[moves[i][0]][moves[i][1]] = 'X';
            else arr[moves[i][0]][moves[i][1]] = 'O';
        }
        String[] board = new String[3];
        int rem = 0;
        for(int i = 0;i < 3;i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0;j < 3;j++) {
                if(arr[i][j] == 'X') sb.append("X");
                else if(arr[i][j] == 'O') sb.append("O");
                else {
                    sb.append(" ");
                    rem++;
                }
            }
            board[i] = sb.toString();
        }
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
        if(win1) return "A";
        if(win2) return "B";
        if(rem > 0) return "Pending";
        return "Draw";
    }
}