public class xor{
public static void main(String[] args) {
    int []a={1,2,1,2,3,4,5,1,2,1,2,3,4};
    int unique=0;
    for(int i=0;i<a.length;i++){
        unique^=a[i];
        System.out.println(unique);
    }
    System.out.println(unique);
}
}

