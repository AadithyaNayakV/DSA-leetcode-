public class square_root {
    public static void main(String[] args) {
        int n=40;
        int low=0,high=n,mid=0;
        double root=0.0;

        while(low<=high){
             mid=(low+high)/2;
            // System.out.println(mid);
            if((mid*mid)==n)

           {root=mid; System.out.println(mid);
            System.exit(mid);}
 
            else if((mid*mid)>n){
                //  System.out.println(high+"high");
                high=mid-1;
            }
            else{
            low=mid+1;
            //  System.out.println(low+"low");
            }

            

        }
        
        System.out.println(root);
        double point=0.1;
        for(int i=0;i<4;i++){
            while((root*root)<=n){
                
                root+=point;
            }
            root-=point;
            point=point/10;

        }
    System.out.println(root);}
}
