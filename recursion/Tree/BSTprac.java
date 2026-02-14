import java.util.Scanner;
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

void makeroot(){
    System.out.print("enetr root");
    int cv=sc.nextInt();
     root=new Node(cv);
    popu(root);
    display(root);
    
}
void popu(Node node){
   while(true)
    { System.out.println("Enter dta");
   int data=sc.nextInt();
   if(data<0)return;

popu1((root), data);}


   
    
}
int h(Node n){
    return (n == null) ? 0 : n.height;
}

void popu1(Node node,int data){
 if(data>node.data){
if(node.right==null)node.right=new Node(data);
else popu1(node.right,data);

    }
    if(data<=node.data){
        if(node.left==null)node.left=new Node(data);
else popu1(node.left,data);
    }
node.height = 1 + Math.max(h(node.left), h(node.right));

}

 boolean balanced(Node node){
    if(node==null)return true;
    if(h(node.left)-h(node.right)<=1){balanced(node.left);balanced(node.right);}
        else return false;
}
void display(Node temp){
    if(temp==null)return;
    
        System.out.println(temp.data);

    display(temp.left);
    display(temp.right);
}

}

public class BSTprac{
    public static void main(String[] args) {
        
        BSTPrac1 b=new BSTPrac1();
        b.makeroot();
        // b.display(null);
    }
}