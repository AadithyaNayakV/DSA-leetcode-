public class first_occurance {
   static int a[]={1,5,3,2,4,5,56,3,5,5,9,5};
   static int last=-1,first=-1;
    public static void main(String[] args) {
      helper(5,a.length-1);  
      System.out.println(first);
      System.out.println(last);
    }
    static void helper(int n,int in){
        if(in<0)return;
        if(a[in]==n){if(last==-1){last=in;}
        first=in;}
        helper(n,--in);
    }

}
