
    // String s="caaaba";
        // int l=4,r=6;
        // int count=0;

        //     for(int i=l-1;i<=r-1;i++){
        //         for(int j=i;j<=r-1;j++){
        //             String g=s.substring(i,j+1);
        //             if(check(g))count++;
        //         }
        //     }
        //     System.out.println(count);

        // static boolean check(String g){
//         int left=0,right=g.length()-1;
//                     while(left<=right){
//                         if(g.charAt(left)!=g.charAt(right))return false;
                        
// left++;right--;
//                     }
//                     return true;
//     }

        public class p3 {     
    public static void main(String[] args) {
    for(int i=0;i<n;i++){
        pal[i][i]=true;
        dp[i][i]=1;
    }

    for(int len=2;len<n;len++){
        for(int ){
            if(s.charAt(i)==s.charAt(j)){
                if(len==2)pal[i][j]=true;
                else{
                    pal[i][j]=pal[i+1][j-1];
                }
            }
            dp[i][j]=dp[i+1][j]+dp[i][j-1]-dp[i+1][j-1];
            if(pal[i][j])dp[i][j]++;
        }
    }
    }
}
