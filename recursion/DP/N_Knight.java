public class N_Knight {
    public static void main(String[] args) {
 boolean board[][] = new boolean[4][4];
 
        helper(board,0,0,0);
    }
 static void display(boolean board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+"\t");
            }
            System.out.println();
        }
         System.out.println(); System.out.println();
    }
     static boolean isSafe(boolean[][] board, int row, int col) {
    int n = board.length;

    // up-left (row-2, col-1)
    if (row - 2 >= 0 && col - 1 >= 0 && board[row - 2][col - 1]) {
        return false;
    }

    // up-right (row-2, col+1)
    if (row - 2 >= 0 && col + 1 < n && board[row - 2][col + 1]) {
        return false;
    }

    // left-up (row-1, col-2)
    if (row - 1 >= 0 && col - 2 >= 0 && board[row - 1][col - 2]) {
        return false;
    }

    // right-up (row-1, col+2)
    if (row - 1 >= 0 && col + 2 < n && board[row - 1][col + 2]) {
        return false;
    }

    return true;
}
   static void helper(boolean board[][],int row,int col,int target){
if(target==4){
    display(board);
    
    return;
}
if(row==board.length)return;
 if(col==board.length){helper(board, row+1, 0, target);
return;}

        if(isSafe(board, row, col)){
board[row][col]=true;
helper(board, row, col+1, target+1);
board[row][col]=false;

        }
       
            helper(board, row, col+1, target);


    }
}
