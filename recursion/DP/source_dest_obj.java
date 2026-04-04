public class source_dest_obj {
    public static void main(String[] args) {
      //  System.out.println(helper("",3,3));
        int a[][]={{0,0,1},{0,0,0},{1,0,0}};
      helper("",0,0,a);
      
    }
   static void helper(String path,int s,int d,int a[][]){
      if(s>2||d>2)return;
      if(a[s][d]==1)return;
        if(s==2&&d==2){System.out.println(path);
   return ;}

        

         helper(path+"D",s+1, d,a);
          helper(path+"R",s, d+1,a);
          
          
    }
}
