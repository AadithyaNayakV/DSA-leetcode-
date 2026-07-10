public class check_palindrome {

static String s="abbbbbab";
static int ind=s.length()-1;
    public static void main(String[] args) {
       System.out.println(helper(s.length()-1)); 
    }
    static boolean helper(int i){
        if(i<0)return true;
        
        boolean ans=helper(--i);
        if(!ans)return false;
        if(i>=0&&ind>=0&&s.charAt(i)!=s.charAt(ind--))return false;

        return true;
    }
}
