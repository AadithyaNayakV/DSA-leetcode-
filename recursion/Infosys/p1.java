// Problem 1: Maximum Sum with 2-Index Gap SelectionYou are given an array $A$ of $N$ positive integers and two integers $X$ and $Y$. 
// Select a subsequence of elements at 0-based indices $i_1 < i_2 < \dots < i_k$ such that:$i_2 - i_1 \ge X$$i_3 - i_2 \ge Y$$i_4 - i_3 \ge X$$i_5 - i_4 \ge Y$and so on, strictly alternating between minimum gaps $\ge X$ and $\ge Y$.You may select any number of elements ($\ge 1$). 
// Find the maximum possible sum of the selected elements.Test Cases
public class p1 {
    public static void main(String[] args) {
        int nums[] = { 10, 50,20 };
        int x = 5, y = 5;
      int c=  helper(x, y, nums, 0, 0);
      System.out.println(c);
    }

    static int helper(int x,int y,int nums[],int ind,int chance){
        if(ind==nums.length)return 0;
        int ch=0;
        int max=0;
        for(int i=ind;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(chance==0){
                if((j-i)>=x){
                    ch=nums[i]+ helper(x,y,nums,j,1);
            max=Math.max(max,ch);

                }
                else continue;
                }
                else if(chance==1){
                    if((j-i)>=y){
                    ch=nums[i]+ helper(x,y,nums,j,0);
            max=Math.max(max,ch);

                }
                else continue; 
                }

            }
             max = Math.max(max, nums[i]);
        }
        return max;
    }
}
