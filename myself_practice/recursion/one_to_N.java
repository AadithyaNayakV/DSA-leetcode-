public class one_to_N {
     static int m=10;
    public static void main(String[] args) {
        helper(m);
    }
    static void helper(int n){
        if(n<=0)return;
        System.out.println(n);
        helper(n-1);
    }
}
