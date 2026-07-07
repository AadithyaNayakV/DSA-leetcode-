
public class sum {
   static int a[]={3,35,20,2};
    public static void main(String[] args) {
        System.out.println(helper(0));
    }
    static int helper(int i){
        if(i>=a.length)return 0;
        return a[i]+helper(i+1);
    }

}
