public class a_power_b {
    static int a=3,b=3;
    public static void main(String[] args) {
       System.out.println(helper()); 
    }
    static int helper(){
        if(b==0)return 1;
        b--;
        return a*helper();
    }
}
