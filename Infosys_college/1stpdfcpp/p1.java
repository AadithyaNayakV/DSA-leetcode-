
public class p1 {
    static int a[] = { 1,2,3};
    static int k = 9;

    public static void main(String[] args) {
        int count=0;
        for (int i = 0; i < a.length; i++) {
            int xor = 0;
            for (int j = i; j < a.length; j++) {
                xor ^= a[j];
                if (xor < k)
                     count++;
                  
            }
           
           

        }
        System.out.println(count);
    }
}
