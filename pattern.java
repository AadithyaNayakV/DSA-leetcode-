// 1
// 12
// 123
// 1234
// 12345
// 123456
// 1234567

// public class pattern {
//     public static void main(String[] args) {
//         int n=7;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++)
//             System.out.print(j);
//             System.out.println("");
//         }
//     }
// }


//      *
//     ***
//    *****
//   *******
//  *********

// public class pattern {
//      public static void main(String[] args) {
//         int n=5,odd=1;
//         for(int j=0;j<n;j++){
//         for(int sp=n-j;sp>=1;sp--){
//             System.out.print(" ");

//         }
//         for(int i=1;i<=odd;i++)
//         System.out.print("*");
//     odd+=2;
// System.out.println("");}
//      }}



// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
// public class pattern {
//      public static void main(String[] args) {
//         int n=5;
        
// for(int i=1;i<n*2;i++){
//     int total= i>n?n*2-i:i;
//     for(int j=0;j<total;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }}}


//     * 
//    * *
//   * * *
//  * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *


// public class pattern {
//      public static void main(String[] args) {
//         int n=5;
        
// for(int i=1;i<n*2;i++){
//     int total= i>n?n*2-i:i;
//     int spt=i>n?(i-n):(n-i);

//     // for(int sp=spt;sp>=1;sp--)
//     for(int sp=1;sp<=spt;sp++)
//     System.out.print(" ");
//     for(int j=0;j<total;j++){
//         System.out.print("* ");
//     }
//     System.out.println();
// }}}


//     1
//    212
//   32123
//  4321234
// 543212345

// public class pattern {
//      public static void main(String[] args) {
// int n=5;int odd=1;

// for(int i=1;i<=n;i++){
//     int total=i;

//  int spt = i>n?(i-n):(n-i);

//     for(int sp=1;sp<=spt;sp++)
//     System.out.print(" ");
//     for(int j=1;j<=odd;j++){
            
//         System.out.print(total);
// total=j>=i?total+1:total-1;
//     }
//      System.out.println();
//      odd+=2;
// }

//      }}


//    1
//    212
//   32123
//  4321234
// 543212345
//  4321234
//   32123
//    212
//     1

// public class pattern {
//      public static void main(String[] args) {
// int n=5;
// int odd=-1;

// for(int i=1;i<=n*2-1;i++){
//        odd=i<=n?(odd+2):(odd-2);
//     int total=i<=n?i:(2*n-i);

//  int spt = i>n?(i-n):(n-i);

//     for(int sp=1;sp<=spt;sp++)
//     System.out.print(" ");
//     for(int j=1;j<=odd;j++){
            
//         System.out.print(total);
// total=i<=n?(j>=i?total+1:total-1):(j>=(2*n-i)?total+1:total-1);
//     }

//      System.out.println();
     
   
// }

//      }}


// 44444444
// 43333334
// 43222234
// 43211234
// 43222234
// 43333334
// 44444444
