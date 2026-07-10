// package Arrays;

public class check_sorted {
    static int a[]={0,2,3,9,9,90};

    public static void main(String[] args) {
        System.out.println(helper(0));
    }

  static int helper(int i){
     if(i==a.length-1)return a[i];
    int ab=helper(i+1);
    if(ab==Integer.MIN_VALUE)return Integer.MIN_VALUE;
     if((ab-a[i])>=0)return a[i]; 
     return Integer.MIN_VALUE;
    }
}
