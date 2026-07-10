public class reverse {
   static  int a[]={1,2,4,5};
    public static void main(String[] args) {
        helper(0,a.length-1);
        for(int i=0;i<a.length;i++)System.out.println(a[i]);
    }
   static void helper(int start,int end){
   if(start>=end)return;
   int temp=a[start];
   a[start]=a[end];
   a[end]=temp;
   helper(start+1,end-1);
   }
}
