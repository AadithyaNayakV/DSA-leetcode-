// package recursion;

public class reversing_num {
    static int sum=0;
    static int rev(int n){
        if(n==0) return sum;
        int  rem=n%10;
         sum=sum*10+rem;

        return rev(n/10);
        
    }
    public static void main(String[] args) {
       int c= rev(8829);

       System.out.println(c);
    }
}
