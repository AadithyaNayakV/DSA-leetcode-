import java.util.Arrays;

public class min_path{
    
    public static void main(String args[]){
        int grid[][]={
            {0,3,1},
            {10,5,1},
            {0,3,1},      
        };

        int [][]dp=new int[grid.length+1][grid[0].length+1];
        for(int a[]:dp)Arrays.fill(a,Integer.MAX_VALUE);
        dp[1][1] = grid[0][0];
        for(int i=1;i<dp.length;i++){
        for(int j=1;j<dp[0].length;j++){
           
                if(i==1 && j==1)
                    continue;
            dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i-1][j-1];
        }
        }
        System.out.println(dp[grid.length][grid[0].length]);


    }
}