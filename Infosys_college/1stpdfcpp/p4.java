import java.util.HashSet;

public class p4 {
    public static void main(String[] args) {
        String s="abcd";
        HashSet<String>set=new HashSet<>();

        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
set.add(s.substring(i, j+1));
            }
        }
        for(String s1:set)System.out.println(s1);
        System.out.println(set.size());
    }
}
