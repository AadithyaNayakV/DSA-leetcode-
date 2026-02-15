import java.util.ArrayList;

public class linear_search {
    // static int helper(int arr[],int n,int index){
    //     if(index==arr.length)return -1;
    //     if(arr[index]==n)return index;
    //     return helper(arr,n,index+1);
    // }

static ArrayList<Integer> list=new ArrayList<>();
static ArrayList  helper(int arr[],int n,int index){
        if(index==arr.length)return list;
        if(arr[index]==n)list.add(index);
        return helper(arr,n,index+1);
    }


    public static void main(String[] args) {
         int arr[]={2,3,6,5,8,8,9,29,8};

        System.out.println(helper(arr,8,0));
    }
}
