public class N_QUEEN {
    public static void main(String[] args) {
        int n=4;

        boolean board[][]=new boolean[4][4];
        System.out.println(helper(board,0));
    }
    static boolean isSafe(boolean board[][],int r ,int c){
     
for(int i=r;i>=0;i--){
    if(board[i][c]){
        return false;
    }
}
int m=Math.min(r,c);
for(int i=1;i<=m;i++ ){
    if(board[r-i][c-i]){
        return false;
    }
}

m=Math.min(r,board.length-c-1);
for(int i=1;i<=m;i++){
    if(board[r-i][c+i]){
        return false;
    }
}
return true;

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
    static int  helper(boolean board[][],int r){
        if(r==board.length){
            display(board);
            return 1;
        } 
int count=0;
        for(int i=0;i<board.length;i++){
                if(isSafe(board,r,i)){
                    board[r][i]=true;
                   count+= helper(board,r+1);
                    board[r][i]=false;
                }
        }
        return count;
    }
}
