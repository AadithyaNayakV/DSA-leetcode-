public class cyclesort{
    public static void main(String[] args) {
        int a[]={4,4,4,5,1};
        int i=0;
        int n=a.length;
        while(i<a.length){
            int correct=a[i]-1;
            if(correct<n&&a[i]!=a[correct]){
                int temp=a[i];
                a[i]=a[correct];
                a[correct]=temp;
            }
            else{
                i++;
            }
             
        }
for(i=0;i<a.length;i++){
    if(a[i]!=i+1){
        System.out.println(i);
        
}

    }
    System.out.println(n);


}
}