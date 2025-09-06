
public class sum_of_digit {
    static int sum=0;
    static int summ(int n){
        if(n==0)return 0;
        int rem=n%10;
        
        
        return rem+ summ(n/10);

    }
    public static void main(String[] args) {
        System.out.println(summ(1349));
    }
}
