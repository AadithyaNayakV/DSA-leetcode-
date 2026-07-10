public class sum_of_dig {
    static int n=29389;
    public static void main(String[] args) {
       System.out.println(helper(n)); 
    }
    static int helper(int n){
        if(n<=0)return 0;
        int sum=0;
        sum=(n%10)+helper(n/10);
        return sum;
    }
}
