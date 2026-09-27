import java.util.ArrayList;
import java.util.List;

public class keys_rooms{
    public static void main(String[] args) {
   List<List<Integer>> list = new ArrayList<>();

list.add(new ArrayList<>(List.of(1)));
list.add(new ArrayList<>(List.of(2)));
list.add(new ArrayList<>(List.of(3)));
list.add(new ArrayList<>());
l.add(0);
helper(l,list);
    }

    boolean helper(){
        if(l.size()==0){
            //check all vis =true else return false;
        }
        if(vis[node])return false;
        vis[node]=true;

        for(int i=0;i<list.get(node).size();i++){
            if(vis[i]||l.contains(i))continue;
            l.add(i);
        }
        int nod=list.remove(0);
        return helper(l,list,nod);
    }
}