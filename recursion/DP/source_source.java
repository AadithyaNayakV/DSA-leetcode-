public class source_source {
    public static void main(String[] args) {
      //  System.out.println(helper("",3,3));
    //   System.out.println(helper(0,0,"DU",0));

    //another trick
String s="UDDUL";
int u=0,l=0,r=0,d=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='U')u++;
        else if(s.charAt(i)=='R')r++;
        else if(s.charAt(i)=='D')d++;
        else if(s.charAt(i)=='L')l++;
    }
    if(u==d&&l==r)System.out.println(true); 
  else System.out.println(false);
      
    }
  static boolean helper(int r,int c,String s,int i){
       
      
         if(r==0&&c==0&&i==s.length())return true;
         if(i>=s.length())return false;
        if(s.charAt(i)=='L'){
           return helper(r,c-1,s,i+1);
        }
        else if(s.charAt(i)=='R'){
           return helper(r,c+1,s,i+1);
        }
       else  if(s.charAt(i)=='U'){
           return helper(r-1,c,s,i+1);
        }
        else if(s.charAt(i)=='D'){
           return helper(r+1,c,s,i+1);
        }
       
        return false;
    }
}

   
