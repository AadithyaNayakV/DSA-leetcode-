public class Count_sort {
    public static void main(String[] args) {
        int a[]={1,1,4,7,6,2,9,0};
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max)max=a[i];
        }
        int freq[]=new int[max+1];
        for(int i=0;i<a.length;i++){
            freq[a[i]]++;
        }
        int j=0,index=0;
        while(j<freq.length){
            if(freq[j]==0){j++;continue;}
        for(int i=0;i<freq[j];i++){
           
            a[index] = j;
            index++;
            
        }
        j++;

    }
for(int i=0;i<a.length;i++)System.out.println(a[i]);
}
}
