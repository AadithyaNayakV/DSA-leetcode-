import java.util.ArrayList;
import java.util.List;

public class coding_question2 {
    static int a[]={1,6,2,5,4,-3};
    static int b=0;
//  static   ArrayList<ArrayList<Integer>>list=new ArrayList<>();
   public static void main(String[] args) {
    helper(new ArrayList<>(),0);
    System.out.println(b);
    
   } 
   static int gcdd(int a,int b){
    while(b>0){
        int t=a%b;
        a=b;b=t;
    }
    return a;
   }
   static int gcd(List<Integer>l){
    int g=l.get(0);
    for(int i=1;i<l.size();i++){
       g= gcdd(g,l.get(i));
    }
    return g;
   }
   static void helper(List<Integer>l,int in){
    if(in==a.length){
        // list.add(new ArrayList<>(l));
       if(l.size()>1&&gcd(l)>1 ){
        int g=0;
        for(int i=0;i<l.size()-1;i++){
            g+=(l.get(i+1)-l.get(i))*(l.get(i+1)-l.get(i))%1000000007;
        }
        b=Math.max(b,g);
       }
        return;
    }
    else  if(in>=a.length){
      
        return;
    }
    l.add(a[in]);
    helper(l,in+1);
    l.remove(l.size()-1);
    helper(l,in+1);

   }
}
