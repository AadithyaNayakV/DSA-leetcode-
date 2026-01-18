import java.util.Scanner;

class Prac1{
    Scanner sc=new Scanner(System.in);

    Node root;
class Node{
    int data;
    Node left;
    Node right;
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
    System.out.print("enetr left"+node.data);
    boolean left=sc.nextBoolean();
    if(left){
        int d=sc.nextInt();
        Node left1=new Node(d);
        node.left=left1;
        popu(left1);
    }
     System.out.print("enetr right of"+node.data);
    boolean right=sc.nextBoolean();
    if(right){
     int d=sc.nextInt();
        Node right1=new Node(d);
        node.right=right1; 
        popu(right1);
    }
    
}
void display(Node temp){
    if(temp==null)return;
    
        System.out.println(temp.data);

    display(temp.left);
    display(temp.right);
}

}

public class prac {
    public static void main(String[] args) {
        Prac1 p=new Prac1();
       p.makeroot();
    }
}
