public class climbing_steps   {
    static int n=3;
    static int dp[]=new int[n+1];
    public static void main(String[] args) {
        System.out.println(helper(n)); 
    }
    // static int helper(){
    //     dp[0]=1;
    //     for(int i=1;i<=n;i++){
    //         dp[i]=dp[i-1]+1;
    //     }
    //     return dp[n];
    // }

    static int helper(int n){
        if(n<=2)return n;
        return helper(n-1)+helper(n-2);
    }

}
