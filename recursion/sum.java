public class sum {
    static int summ(int n){
        if(n==1)return 1;
        else
         return n+summ(n-1);
    }
    public static void main(String[] args) {
        System.out.println(summ(5));
        
    }
    
}
