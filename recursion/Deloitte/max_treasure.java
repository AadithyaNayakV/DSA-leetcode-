import java.util.Arrays;

public class max_treasure{
  static  boolean vis[][];
    public static void main(String[] args) {
        int n=3,m=3;
        vis=new boolean[n][m];
        int nums[][]={
            {5,2,3},
            {1,4,6},
            {2,7,8}
        };
        System.out.println(helper(n,m,nums,0,0));
    }
    static int helper(int n,int m,int nums[][],int r,int c){
        if(r>=n||c>=m||c<0||r<0)return Integer.MIN_VALUE;
        if(vis[r][c])return Integer.MIN_VALUE;
        if(r==n-1&&c==m-1)return nums[r][c];
        int score =nums[r][c];
        vis[r][c]=true;
        int a=score+helper(n,m,nums,r+1,c);
        int b=score+helper(n,m,nums,r-1,c);
        int c1=score+helper(n,m,nums,r,c+1);
        int d=score+helper(n,m,nums,r,c-1);
           vis[r][c]=false;
        

        return Math.max(Math.max(a,b),Math.max(c1,d));

    } 
}