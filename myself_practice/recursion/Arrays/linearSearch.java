// package Arrays;

public class linearSearch {
    static int a[]={3,0,22,9,38,22,9,3};
   static  int key=30;
    public static void main(String[] args) {
        System.out.println(helper(0));
    }

    static boolean helper(int i){
        if(i>=a.length)return false;
        if(key==a[i])return true;
        return helper(i+1);
    }

}
