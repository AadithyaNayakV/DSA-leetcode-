public import java.util.Scanner;

class BSTPrac1{
    Scanner sc=new Scanner(System.in);

    Node root;
class Node{
    int data;
    Node left;
    Node right;
    int height;
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
void pro(Node node){
    if(node!=null){
        pro(node.left);
        pro(node.right);
        System.out.println(node);
    }
}}
public class postder {
    public static void main(String[] args) {
        
    }

}
