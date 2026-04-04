public class source_dest_4dir {

  public static void main(String[] args) {
      //  System.out.println(helper("",3,3));
        int a[][]={{0,0,0},{0,0,0},{0,0,0}};
   
  int  d[][]={{0,0,0},{0,0,0},{0,0,0}};


      helper("",0,0,a,d);
      
    }
   static void helper(String path,int s,int d,int a[][],int [][]dd){
      if(s>2||d>2)return;
      if(s<0||d<0)return;
      if(a[s][d]==1)return;
        if(s==2&&d==2){System.out.println(path);
   return ;}

   


        a[s][d]=1;
         helper(path+"D",s+1, d,a,dd);
          helper(path+"R",s, d+1,a,dd);
          helper(path+"L",s, d-1,a,dd);
          helper(path+"U",s-1, d,a,dd);
          a[s][d]=0;
          
          
    }
}
