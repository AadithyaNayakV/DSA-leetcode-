import java.util.HashSet;

public class sudoko {
    public static void main(String[] args) {
        HashSet<String>set=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(s[j]==".")continue;
                if(!set.add(s[j]+"@row"+i)||!set.add(s[j]+"@col"+j)||!set.add(s[j]+"@box"+i/3+j/3)){
                    return false;
                }
            }
            return true;
        }

    }
}
