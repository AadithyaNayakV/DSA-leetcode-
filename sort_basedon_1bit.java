public class sort_basedon_1bit {
   
    public static void main(String[] args) {
        int[] arr={0,1,2,4,8,3,5,6,7};
        int a[]=new int [arr.length];
        for(int i=0;i<arr.length;i++){
            int n=arr[i],count=0;
            while(n>0){
                n=n&(n-1);
                count++;
            }
            a[i]=count;
        }
        
          for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min])min=j;
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        //  for(int i=0;i<arr.length;i++)
        //     System.out.println(arr[i]);
        // System.out.println("___________________");
        //  for(int i=0;i<arr.length;i++)
        //     System.out.println(a[i]);

        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(arr[j]<arr[min]&&a[i]==a[j])min=j;
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
          for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);


    }
    

}
