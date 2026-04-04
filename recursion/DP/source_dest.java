public class source_dest {
    public static void main(String[] args) {
      //  System.out.println(helper("",3,3));
      helper("",3,3);
      
    }
   static void helper(String path,int s,int d){
      if(s<1||d<1)return;
        if(s==1&&d==1){System.out.println(path);
   return ;}

        

         helper(path+"D",s-1, d);
          helper(path+"R",s, d-1);
          helper(path+"di",s-1, d-1);
          
    }
}
