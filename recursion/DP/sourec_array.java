import java.util.Arrays;

public class sourec_array {
    public static void main(String[] args) {
        int p[][]=new int[3][3];
      helper("",0,0,p,1);
    //   System.out.println(helper(0,0,"DU",0));
      
    }
 static void helper(String path,int s,int d,int [][]p,int count){
       if(s>2||d>2)return;
      if(s<0||d<0)return;
        if(s==2&&d==2){
            p[s][d]=count;
            for(int []arr:p)System.out.println(Arrays.toString(arr));
            System.out.println(path);
            System.out.println();
   return ;}
   if(p[s][d]!=0)return;
p[s][d]=count;

         helper(path+"U",s-1, d,p,count+1);
          helper(path+"L",s, d-1,p,count+1);
          helper(path+"R",s, d+1,p,count+1);
          helper(path+"D",s+1, d,p,count+1);
   p[s][d]=0;
          
          
    }
}
