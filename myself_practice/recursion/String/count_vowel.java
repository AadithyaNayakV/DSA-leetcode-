

public class count_vowel {
    static String s ="";
    public static void main(String[] args) {
        System.out.println(helper(0));
    }
    static int helper(int in){
        if(in>s.length()-1)return 0; 
        int count=0;
        if(s.charAt(in)=='a'||s.charAt(in)=='e'||s.charAt(in)=='i'||s.charAt(in)=='o'||s.charAt(in)=='u'){
           
       count= 1+helper(in+1);
        }
        else{
  count=helper(in+1);

        }
        
       return count;
    }
}
