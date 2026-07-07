// package Arrays;

public class product {
     static int a[]={3,5,10,2};
    public static void main(String[] args) {
        System.out.println(helper(0));
    }
    static int helper(int i){
        if(i>=a.length)return 1;
        return a[i]*helper(i+1);
    }
}
