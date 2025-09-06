public class a_power_b {
    public static void main(String[] args) {
        int a=3,b=4,base=3,sum=1; //110

        while(b>0){
            int last=b&1;
            if(last!=0)
            {sum*=base;
            }
            base*=base;
           b= b>>1;

        }
System.out.println(sum);
    }
}
