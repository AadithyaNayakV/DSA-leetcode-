public class sudoku {
public static void main(String[] args) {
int[][] board = {
    {5,3,0,0,7,0,0,0,0},
    {6,0,0,1,9,5,0,0,0},
    {0,9,8,0,0,0,0,6,0},
    {8,0,0,0,6,0,0,0,3},
    {4,0,0,8,0,3,0,0,1},
    {7,0,0,0,2,0,0,0,6},
    {0,6,0,0,0,0,2,8,0},
    {0,0,0,4,1,9,0,0,5},
    {0,0,0,0,8,0,0,7,9}
};
        helper(board,0,0);

}   
 static void display(int board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+"\t");
            }
            System.out.println();
        }
         System.out.println(); System.out.println();
    }

    static boolean isSafe(int[][]board,int row,int col,int num){
for(int i=1;i<=9;i++)if(num==board[row][i-1])return false;
for(int i=1;i<=9;i++)if(num==board[i-1][col])return false;
int startRow = (row / 3) * 3;
int startCol = (col / 3) * 3;

for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        if (board[startRow + i][startCol + j] == num) {
            return false;
        }
    }}
    return true;


    }
static void helper(int [][]board,int row,int col){
if(row==board.length){display(board);return;}
if(col==board.length){ helper(board,row+1,0); return;}

if (board[row][col] != 0) {
helper(board, row, col + 1);
return;
}
for(int i=1;i<=9;i++){
if(isSafe(board,row,col,i)){
    board[row][col]=i;
    helper(board,row,col+1);
    board[row][col]=0;
}
}
}
}
