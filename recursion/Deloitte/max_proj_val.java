import java.util.Arrays;

public class max_proj_val {
   static int dp[][];
    public static void main(String[] args) {
       int n= 7,k= 3;
       dp=new int[k+1][n+1];
       for(int a[]:dp)Arrays.fill(a,-1);
int nums[]={5 ,10, 20, 15, 30, 10, 25};
int ans=helper(nums,0,n,k);
System.out.println(ans);
    }
    static int helper(int nums[],int index,int n,int k){
        if(k<=0)return 0;
        if(index==nums.length)return 0;
        if(index>=nums.length)return Integer.MIN_VALUE/2;
if(dp[k][index]!=-1)return dp[k][index];
        int skip=helper(nums,index+1,n,k);
        int take=nums[index]+helper(nums,index+2,n,k-1);

        return  dp[k][index]=Math.max(skip,take);

    }
}
