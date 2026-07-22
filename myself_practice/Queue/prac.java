import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(){}
    TreeNode(int val){
this.val=val;
    }

}

//  Queue<TreeNode>q=new ArrayDeque<>();
//                 List<List<Integer>> levels = new ArrayList<>();

//         if(root==null)return new ArrayList<>();
//         q.offer(root);
//         while(!q.isEmpty()){
//         ArrayList<Integer>list=new ArrayList<>();  

//         for(int i=0;i<q.size();i++){
//             TreeNode k=q.poll();
//              list.add(k.val); 
//             if(k.left!=null)q.offer(k.left);
//             if(k.right!=null)q.offer(k.right);

//         }
//         levels.add(list);

//     }

public class prac {
    public static void main(String[] args) {
       Queue<Integer>q=new ArrayDeque<>();

       if(root==null)return new ArrayList<>();

       q.offer(root);
       while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode s=q.pop();
                if(i==size-1)ans.add(s.val);
                if(s.left!=null)q.offer(s.left);
                if(s.rigth!=null)q.offer(s.right);

                
            }
       }



    }
}
