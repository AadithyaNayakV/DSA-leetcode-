public class coin_change{
    public static void main(String[] args) {
        


        
    }

int helper(){
if(sum>amount)return Integer.MAX_VALUE;
if(sum==amount)return 1;
        for(int  i=0;i<nums.length;i++){
             count =helper(sum+nums[i]);
             Math.min(min,count);
        }
    }
}