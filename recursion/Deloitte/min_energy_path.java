import java.nio.channels.InterruptibleChannel;

public class min_energy_path{
    static int n=3,m=3;
    static boolean vis[][];
    public static void main(String[] args) {
        int nums[][]={
            {1,2,3},
            {4,1,2},
            {5,6,1 }
        };
        vis=new boolean[n][m];
        int ans=helper(nums,0,0);
        System.out.println(ans);
    }
static int helper(int [][]nums,int r ,int c){
    if(r>=n||c>=m||r<0||c<0)return Integer.MAX_VALUE/2;
    if(r==n-1&&c==m-1)return nums[r][c];
    if(vis[r][c])return Integer.MAX_VALUE/2;
    vis[r][c]=true;
    int u=helper(nums, r+1, c);
    int v=helper(nums, r-1, c);
    int x=helper(nums, r, c+1);
    int y=helper(nums, r, c-1);
    vis[r][c]=false;
        return nums[r][c]+Math.min(Math.min(u,v),
        Math.min(x,y));
    }
}