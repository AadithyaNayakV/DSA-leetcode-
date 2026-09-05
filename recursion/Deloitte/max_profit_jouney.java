import java.util.Arrays;

public class max_profit_jouney{
    static  int dp[];
    public static void main(String[] args) {
        int nums[]={10,20,0,8,9,9};
        dp=new int[nums.length];
        Arrays.fill(dp,Integer.MIN_VALUE);
        int k=3;


        dp[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
               for(int j=i+2;j<nums.length&&j<=i+k;j++){
                dp[i]=Math.max(dp[i],dp[j]+nums[i]);
               }
        }
        System.out.println(dp[0]-nums[0]);


    //    int ans= helper(0,nums,k);
    //    System.out.println(ans-nums[0]);
    }
  static  int helper(int index,int []nums,int k){
        if(index>=nums.length)return Integer.MIN_VALUE/2;
        if(index==nums.length-1)return nums[index];
        if(dp[index]>=0)return dp[index];
int max=Integer.MIN_VALUE;
        for(int i=index+2;i<=index+k&&i<nums.length;i++){
            max=Math.max(max,helper(i,nums,k));
        }
if(max==Integer.MIN_VALUE)return dp[index]=Integer.MIN_VALUE/2;
        return dp[index]=nums[index]+max;
    }
}