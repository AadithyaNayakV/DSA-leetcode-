import java.util.Arrays;

public class unique_path_obstacle {
    public static void main(String[] args) {
        int grid[][] = {
                { 0, 1, 0 },
                { 1, 0, 0 },
                { 0, 0, 0 },
        };

        int[][] dp = new int[grid.length + 1][grid[0].length + 1];
        // for(int a[]:dp)Arrays.fill(a,1);
        dp[1][1]=1;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
if(i==1&&j==1)continue;
                if (grid[i - 1][j - 1] == 1) {
                    dp[i][j] = 0;
                    continue;
                }
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        System.out.println(dp[grid.length][grid[0].length]);

    }

    // helper(){
    // if(grid[r][c]==1)return 0;
    // if(r==grid.elngth-1&&c==grid[0].lemngth-1)return 1;

    // return helper(r+1,c)+ helper(r,c+1);

    // }
}
