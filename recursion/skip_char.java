public class skip_char {
    static String helper(char ch,String s){
        if(s.isEmpty())return s;
      else  if(s.charAt(0)!=ch) return s.charAt(0)+helper( ch,s.substring(1));
       else return helper( ch,s.substring(1));
      
        
    }
    public static void main(String[] args) {
        String s="baccad";
        System.out.println(helper('a',s));
    }
}
