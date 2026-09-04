// package myself_practice.DP;

public class min_cost_climbing_stairs {
 static   int a[]={1,3,5,2,1,0,7};
    public static void main(String[] args) {
        // System.out.println(helper(0));

        int dp[]=new  int[a.length];
        int n=a.length;

        dp[n-1]=a[n-1];

        for(int i=n-2;i>=0;i--){
        int one=dp[i+1];

        int second=Integer.MAX_VALUE;
        if(i+2<n)second=dp[i+2];
            dp[i]=a[i]+Math.min(one,second);

        }

    }
    static int helper(int index){
        if(index>=a.length)return Integer.MAX_VALUE/2;
        if(index==a.length-1)return a[index] ;
        

        int one=a[index]+helper(index+1);
        int two=a[index]+helper(index+2);

        return Math.min(one,two);

    }
}
