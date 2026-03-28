import java.util.ArrayList;

public class number_of_diceroll_with_target {
static ArrayList<String> list=new ArrayList<>();
    public static void main(String[] args) {
        helper("",4);
         for(String s:list){
            System.out.println(s);
        }
    }
    static void helper(String p,int target){
        if(target==0){
            list.add(p);
            System.out.println(p);
            return ;
        }
        for(int i=1;i<=6&&i<=target;i++){
            helper(p+i,target-i);
        }
    }
}
