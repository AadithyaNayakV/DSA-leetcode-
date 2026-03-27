import java.util.ArrayList;

public class ValidPhoneNumber {
    public static void main(String[] args) {
        // 1 2 abc def
        helper("","12")
       
        

    }
    static void helper(String p,String un ){
        if(un.isEmpty()){
            System.out.println(p);
        }
        int digit = '0'-un.charAt(0);
        for(int i=((digit-1)*3);i<((digit)*3)+3;i++){
            char ch=(char)('a'+i);
            helper(p+ch,un.substring(1));

        }
    }
}
