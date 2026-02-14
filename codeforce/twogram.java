import java.util.HashMap;

public class twogram {
    public static void main(String[] args) {
        String a="skhhsk";
       HashMap<String, Integer> h = new HashMap<>();
        for(int i=0;i<a.length()-1;i++){
           
    String n = a.substring(i, i + 2);

    h.put(n, h.getOrDefault(n, 0) + 1);
        }
        //print highest freq thats it
    }
}
