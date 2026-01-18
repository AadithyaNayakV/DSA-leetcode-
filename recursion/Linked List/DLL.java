class LinkedLists {
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head;
    Node tail;
    int size=0;

    void insertf(int a){
        Node newnode=new Node(a);
        if(head==null){
            head =newnode;
            tail=newnode;
return ;
        }
         newnode.next =head;
         head.prev=newnode;
         head=newnode;
          
size++;
    }
    void insertl(int a){
        Node newnode=new Node(a);
        if(head==null){
            head =newnode;
            tail=newnode;
return ;
        }
        newnode.prev=tail;
        tail.next=newnode;
        tail=newnode;
        size++;
    }
    void insertp(int a,int p){
        int i=1;
            Node newnode=new Node(a);
            Node temp=head;
        while(i<p-1){
            temp=temp.next;
i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        newnode.prev=temp;
size++;
    }

    void reverse(){
        Node temp=head;

        while(temp!=null){
            Node t=temp.next;
            temp.next=temp.prev;
            temp.prev=t;
            temp=temp.prev;

        }
      Node  t=head;
        head=tail;
        tail=t;
    }
     void display(){
        if(head!=null){
            Node temp=head;
            while(true){
                System.out.println(temp.data);
                if(temp.next==null)return;
                temp=temp.next;
            }
        }
   
    }

}
public class DLL {
    public static void main(String[] args) {
        LinkedLists l=new LinkedLists();
        l.insertf(10);
        l.insertf(20);
        l.insertl(70);
        
        l.display();
        l.reverse();
        l.display();
    }
}
