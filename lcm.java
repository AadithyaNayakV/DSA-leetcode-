// public class lcm {
//     public static void main(String[] args) {
//         int []a={7,9,21};
//         int lcm=0;
//         int b=a[0];
//         for(int i=1;i<a.length;i++){
//             // System.out.println(b);
//             int hcf=hcff(b,a[i]);
//             // System.out.println(hcf);
//          lcm=(a[i]*b)/hcf;
//          b=lcm;
//         //  System.out.println(lcm);
//     }
//     System.out.println(lcm);
        
//     }
    
//      static int hcff(int m ,int n){
//        if(m%n==0){
//             return n;
//         }
//         int rem=m%n;
//         m=n;n=rem;
//        return  hcff(m, n);
        
//     }
// }


public class lcm{
    public static void main(String[] args) {
        int a=8,b=99;
       lcmm(a,b);
    }
    static void lcmm(int a,int b){
         if(b%a==0)
        System.out.println(b);
        else{
            lcmm(a,b*2);
        }
    }

}