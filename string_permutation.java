public class string_permutation {
    public static void main(String[] args) {
        helper("","abc");
    }

    static void helper(String a,String b){
        if(b.isEmpty()){System.out.println(a);return;}
        char ch=b.charAt(0);

        for(int i=0;i<=a.length();i++){
            String first=a.substring(0,i);
            String sec=a.substring(i);
            helper(first+ch+sec, b.substring(1));
        }
        
    }

}
