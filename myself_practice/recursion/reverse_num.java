// package myself_practice.recursion;

public class reverse_num {
    static int n=78556;
    public static void main(String[] args) {
        System.out.println(helper(0));
    }
    static int helper(int rev){
        if(n==0)return rev;
        int m=n%10;
        n=n/10;
        return helper(rev*10+m);
    }
}
