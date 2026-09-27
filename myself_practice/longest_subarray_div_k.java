
public class longest_subarray_div_k {
    public static void main(String[] args) {
        int nums[]={1,3,4,0,7};
        int k=7;
prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
 for(int i=1;i<nums.length;i++){
    int rem=prefix[i]%k;
if(map.containsKey(rem))max=Math.max(i-map.get(rem),max);
else map.put(i,rem);
 }
        
    }
}
