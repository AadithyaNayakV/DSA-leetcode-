// public class prime {
//     public static void main(String[] args) {
//         int n=10;
//         for(int i=2;i<10;i++){
           
//             for(int j=2;j<=Math.sqrt(i);j++){
//                 if(i%j==0)
// {System.out.println(i+""+false);break;}
// System.out.println(true);




//             }

//         }
//   }
// }

// abv is not optimized



public class prime {
    public static void main(String[] args) {
        int n=40;
        boolean bool[]=new boolean [n+1];
        // System.out.println(bool[0]);
        //false means prime

        for(int i=2;i<=Math.sqrt(n);i++){

            for(int j=i*2;j<=n;j+=i){
                bool[j]=true;
            }


        }

        for(int i=2;i<=n;i++)
        if(!bool[i])
        System.out.println(i);

}}