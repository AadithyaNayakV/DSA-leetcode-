// package myself_practice.recursion;

public class sum_of_1st_n {
    static int m=10;
    public static void main(String[] args) {
       System.out.println(helper(0)); 
    }
    static int helper(int n,int sum){
        if(m==n)return sum+n;
        
         sum=helper(n+1,sum+n);
        return sum;
    }
}
