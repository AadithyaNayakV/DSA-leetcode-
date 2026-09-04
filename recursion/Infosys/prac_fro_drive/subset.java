public class subset {
    public static void main(String[] args) {
       
        
    }

    helper(){
        if(node==nums.length)Mainlist.add(new ArrayList<>(list));
        helper(list,index+1);
        for(int i=node;i<nums.length;i++){
           helper( list.add(nums[i]),index+1));
           list.reove(List.size(0));
        }
    }
}
