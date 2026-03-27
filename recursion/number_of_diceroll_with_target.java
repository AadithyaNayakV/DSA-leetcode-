import java.util.ArrayList;

public class number_of_diceroll_with_target {
static ArrayList<String> list=new ArrayList<>();
    public static void main(String[] args) {
        helper(0,4,4);
         for(String s:list){
            System.out.println(s);
        }
    }
    void helper(String p,int un,int target){
        if(p==target){
            list.add(p);
        }
    }
}
