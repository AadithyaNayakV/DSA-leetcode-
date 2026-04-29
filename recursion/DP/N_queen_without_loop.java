public class N_queen_without_loop {
    public static void main(String[] args) {
        int n = 4;

        boolean board[][] = new boolean[4][4];
        helper(board, 0, 0, 0);
    }

    static boolean isSafe(boolean board[][], int r, int c) {

        for (int i = r; i >= 0; i--) {
            if (board[i][c]) {
                return false;
            }
        }
        int m = Math.min(r, c);
        for (int i = 1; i <= m; i++) {
            if (board[r - i][c - i]) {
                return false;
            }
        }

        m = Math.min(r, board.length - c - 1);
        for (int i = 1; i <= m; i++) {
            if (board[r - i][c + i]) {
                return false;
            }
        }
        return true;

    }

    static void display(boolean board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }

 static   void helper(boolean board[][], int row, int col, int target) {
        if (target == board.length) {
            display(board);
            return ;
        }
        // int count=0;
            if(col==board.length){return;}

        if(isSafe(board, row, col)){
board[row][col]=true;
helper(board, row+1, 0, target+1);
board[row][col]=false;

        }
       
            helper(board, row, col+1, target);
        

        // return count;

    }
}
