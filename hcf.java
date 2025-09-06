public class hcf{
    public static void main(String[] args) {
        int a=12,b=8,max=1;
       
        for(int i=2;i<=a;i++){
            if(a%i==0&&b%i==0)
            max=i;
        }
        System.out.println(max);
        hcff(a,b);
        euclid(a,b);
    }
    static void hcff(int a ,int b){
        if(b%a==0)
        System.out.println(a);
        else
        hcff(a/2,b);
    }
    static void euclid(int m,int n){
        if(m%n==0){
            System.out.println(n);
            System.exit(0);
        }
        int rem=m%n;
        m=n;n=rem;
        euclid(m, n);
    }
}

