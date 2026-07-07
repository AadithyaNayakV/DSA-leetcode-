

public class minimum {
     static  int a[]={3,9,21,9,2,1};
    public static void main(String[] args) {
       System.out.println(helper(0)); 
    }
    static int helper(int i){
      if(i==a.length)return Integer.MAX_VALUE;
      return Math.min( a[i],helper(i+1)); 
    } 
}
