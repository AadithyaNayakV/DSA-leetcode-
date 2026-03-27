import java.util.ArrayList;

public class ValidPhoneNumber {
static ArrayList<String> list=new ArrayList<>();
    public static void main(String[] args) {
        // 1 2 abc def
        helper("","12");
       
        for(String s:list){
            System.out.println(s);
        }

    }
    static void helper(String p,String un ){
        if(un.isEmpty()){
            // System.out.println(p);
            list.add(p);
            return;
            
        }
        int digit = un.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            helper(p+ch,un.substring(1));

        }
        
    }
}
