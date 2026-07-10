// package Arrays;
import java.util.HashMap;
import java.util.Map;

public class count_occurences {
    
    static int a[]={3,0,22,9,38,22,9,3};
    static HashMap<Integer,Integer>map=new HashMap<>();
    public static void main(String[] args) {
        helper(0);
        for(Map.Entry<Integer,Integer>Entry:map.entrySet()){
            System.out.println(Entry.getValue());
        }

    }
    static void helper(int i){
        if(i>=a.length)return ;
map.put(a[i],map.getOrDefault(a[i],0)+1);
helper(i+1);
    }
}