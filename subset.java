public class subset {
    static void subseq(String p,String q){
        if(q.isEmpty()){System.out.println(p);return;}
        char up=q.charAt(0);
        subseq(p+up,q.substring(1));
        subseq(p,q.substring(1));

    }
    public static void main(String[] args) {
        subseq("", "abc");
    }
}
