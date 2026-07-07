// package Arrays;

public class maximum {
   static  int a[]={3,9,21,9,2,0,1,0,0,1};
    public static void main(String[] args) {
       System.out.println(helper(0)); 
    }
    static int helper(int i){
      if(i==a.length)return Integer.MIN_VALUE;
      return Math.max( a[i],helper(i+1)); 
    } 
}
