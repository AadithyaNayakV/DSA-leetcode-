import java.util.Arrays;

public class max_val_partition {
    static  int dp[][];
    public static void main(String[] args) {
        int k=2;
        int nums[]={1,2,3,4,5};
        dp=new int[k+1][nums.length];
        for(int a[]:dp)Arrays.fill(a,-1);

        int ans=helper(0,k,nums);
        System.out.println(ans);
    }
    static int helper(int index,int k,int nums[]){
        if(dp[k][index]!=-1)return dp[k][index];
        if(k==1){
            int sum=0;
            for(int i=index;i<nums.length;i++)sum+=nums[i];
            return dp[k][index]=sum*sum;
        }
        if(k<0)return Integer.MIN_VALUE;
        int sum=0;
        int main=Integer.MIN_VALUE;

        for(int i=index;i<=nums.length-k;i++){
            sum+=nums[i];
            int cur=sum*sum+helper(i+1,k-1,nums);
            main=Math.max(cur,main);
        }
        return dp[k][index]=main;
        }
    }

