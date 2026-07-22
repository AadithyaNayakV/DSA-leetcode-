import java.util.Arrays;

public class q3 {
   static int n=5;
   static int q[][]={
       {2,1,3},
        {2,1,1},
        {1,1,1},
        {1,1,2},
        {2,2,2}
    };
   static int a[]=new int[n];
   static int check(int left,int right){
    int ans=1;
    for(int i=left-1;i<right;i++){
        for(int j=i+1;j<right;j++){
            int root=(int)Math.sqrt(a[i]*a[j]);
            if(a[i]*a[j]==root*root)ans=Math.max(ans,(j)-i+1);
            else {break;}
        }
    }
    return ans;
   }
   public static void main(String[] args) {
    int xor=0;
        Arrays.fill(a,1);
        for(int i=0;i<q.length;i++){
            if(q[i][0]==1){
                a[q[i][1]-1]=q[i][2];
            }
            else{
                xor^=check(q[i][1],q[i][2]);
            }
        }
System.out.println(xor);
    }
}
