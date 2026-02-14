public class reverse {
   static int s=0;
   static int rev(int n){
    if(n!=0)
  
      { int d= n%10; 
       s=s*10+d;
       rev(n/10);}
       return s;
    }
    public static void main(String[] args) {
        int n=2402;
        System.out.println(n==rev(n)); 
    }
}
