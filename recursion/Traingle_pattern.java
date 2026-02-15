public class Traingle_pattern {
    static void helper(int i,int j){
        if(i<0)return;
        if(i==j){
            System.out.println();
             helper(i-1,0);
        }
        else
       { System.out.print("*");
         helper(i,j+1);}
    }
    public static void main(String[] args) {
        helper(4,0);
    }
}
