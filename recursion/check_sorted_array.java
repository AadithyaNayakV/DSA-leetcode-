public class check_sorted_array {
    static boolean helper(int arr[],int index){
        if(index==arr.length-1)return true;
        return(arr[index]<=arr[index+1]&&helper(arr,index+1));
    }
    public static void main(String[] args) {
        int arr[]={2,3,6,5,8,9,29};
        System.out.println(helper(arr,0));
    }
}
