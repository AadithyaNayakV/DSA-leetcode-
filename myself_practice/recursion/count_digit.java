public class count_digit {
 static   int n=8847033;
    public static void main(String[] args) {
        System.out.println(helper());
    }
    static int helper(){
        if(n==0)return 0;
        int count=0;
        n/=10;
        count=1+helper();
        return count;
    }
}
