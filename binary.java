public class binary{
    public static void main(String[] args) {
        int magicno= 4,base=1,sum=0;
        // 110
        while(magicno>0){
       int last=magicno&1;
        base=base*5;
       magicno=magicno>>1;
       

       sum+=last*base;}

System.out.println(sum);
    }

}



// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// class binary {
    
    
//     public static boolean isHappy(int n) {
//         if(n==1)
//         return true;
//         int in=n*n;
//         int sq=0,last=0;
//         while(n!=1){
//              if(in==n)
//              return false;    
        
//         sq=0;last=0;
//             while(n>0){
//                 last=n%10;
//                 sq=sq+(last*last);
//                 n=n/10;
//             }
//             System.out.println(sq);
//             n=sq;

//         }
//         return true;
//     }

//     public static void main(String[] args) {
//        System.out.println(isHappy(19)); 
//     }
// }