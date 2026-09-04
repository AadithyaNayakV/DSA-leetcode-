// package recursion.Deloitte;

import java.util.Arrays;

public class min_cost_jump {

    static int dp[];

    public static void main(String[] args)  

    {
        int n = 6;
        dp = new int[n];
        Arrays.fill(dp, -1);
        int a[] = { 10, 10, 15, 2, 5, 8 };
        int ans = helper(0, a, n) - a[0];
        System.out.println(ans);
    }

    static int helper(int index, int a[], int n) {
    if (index == a.length - 1)
    return a[index];
    if (index > a.length - 1)
    return Integer.MAX_VALUE / 2;
    if(dp[index]!=-1)return dp[index];
    int current=a[index];
    int a1 = a[index] + helper(index + 1, a, n);
    int a2 = a[index] + helper(index + 2, a, n);
    int a3 = a[index] + helper(index + 3, a, n);

    return dp[index]= Math.min(a1, Math.min(a2, a3));
    }
}
