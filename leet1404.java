class leet1404 {
    public static void main(String[] args) {
    
    String s ="1111011110000011100000110001011011110010111001010111110001";
       
       int decimal=0;
       int pow=1;
      int i=s.length()-1;
       while(i>=0){
int last=s.charAt(i) - '0';       
        decimal=decimal+(last*pow);
        pow=pow*2;
       i--;
       }
       System.out.println(decimal);
       int count=0;
       while(decimal>1){
            if(decimal%2==0)decimal=decimal/2;
            else decimal+=1;
            count++;
       }
      System.out.println(count);
    }
}