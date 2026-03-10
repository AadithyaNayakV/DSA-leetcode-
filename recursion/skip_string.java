public class skip_string {
    static String helper(String ch,String s){
        if(s.isEmpty())return s;
      else  if(!s.startsWith(ch)) return s.charAt(0)+helper( ch,s.substring(1));
       else return helper( ch,s.substring(5));
      
        
    }
    public static void main(String[] args) {
        String s="baccadappl";
        System.out.println(helper("apple",s));
    }
}
