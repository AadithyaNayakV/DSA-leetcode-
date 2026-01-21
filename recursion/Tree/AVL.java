import java.util.Scanner;
class BSTPrac2{
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

root = popu1(root, data);}
    
}
int h(Node n){
    return (n == null) ? 0 : n.height;
}

Node popu1(Node node,int data){
    if(node==null){
        Node nw=new Node(data);
        return nw;
    }
 if(data<node.data){

node.left=popu1(node.left,data);

    }
    if(data>=node.data){
        node.right= popu1(node.right,data);
    }
node.height = 1 + Math.max(h(node.left), h(node.right));
return rotate(node);

}

Node rotate(Node node){
    //left left
    if(h(node.left)-h(node.right)>1){
        //left right
        if((h(node.left.right)-h(node.left.left))>=1){
          node.left=  leftrotate(node.left);
return rightrotate(node);
        }
        else return rightrotate(node);

    }
    //right right
      if(h(node.left)-h(node.right)<-1){
        //right left
        if((h(node.right.left)-h(node.right.right))>0){
        node.right=  rightrotate(node.right);
        return leftrotate(node);

        }
        else return  leftrotate(node);

    }
    return node;
    
}
 Node rightrotate(Node node){
Node c=node.left;
Node g =c.left; 
node.left=c.right;
c.right=node;
node.height=Math.max(h(node.left),h(node.right))+1;
c.height=Math.max(h(c.left),h(c.right))+1;
return c;
 }

 Node leftrotate(Node node){
Node c=node.right;
Node g =c.right; 
node.right=c.left;
c.left=node;
node.height=Math.max(h(node.left),h(node.right))+1;
c.height=Math.max(h(c.left),h(c.right))+1;
return c;
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



public class AVL {
    public static void main(String[] args) {
        
    }
}
