import java.util.ArrayList;
import java.util.List;

public class ArrayKaSubset {
    public static void main(String[] args) {
        int a[]={1,2,2};
        List<List<Integer>> t=helper(a);
        for(List l:t)
            System.out.println(l);
    }
    static List<List<Integer>> helper(int []a){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
int start=0;
int end=0;
        for(int k=0;k<a.length;k++){
            if(k>0&&a[k-1]==a[k]){
                start=end;
            }
            int n=outer.size();
            end=n;
            for(int i=start;i<n;i++){
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(a[k]);
                outer.add(internal);
            }
        }return outer;
    }
}
