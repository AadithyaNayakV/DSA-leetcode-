// import java.util.LinkedList;

// public class prac {
//     public static void main(String[] args) {
//         LinkedList<Integer>list=new LinkedList<>();
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         System.out.println(list);
//     }
// }


class LinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    Node tail;
    int size=0;

     void insertfirst(int a){
        Node newnode=new Node(a);
        if(head==null){
            head=newnode;
            tail=newnode;   
            newnode.next=head;
        }
        newnode.next=head;
        head=newnode;
        size++;
        
    } void insertlast(int a){
        Node newnode=new Node(a);
         if(head==null){
            head=newnode;
            tail=newnode;   
            newnode.next=head;
        }
        tail.next=newnode;
        tail=newnode;        size++;

    }void insertatpos(int a,int p){
        Node newnode=new Node(a);
        int i=1;
        Node temp=head;
if(p==1)return;

        while(temp != null &&i<p-1){
            temp=temp.next;
            i++;
        } if (temp == null) {
        System.out.println("Position out of range");
        return;
    }
        newnode.next=temp.next;
        temp.next=newnode;
        if (newnode.next == null) {
        tail = newnode;
    }
               size++;

    }
    void deletefirst(){
        if(head==null)return;
        if(head==tail)head=tail=null;
        Node temp=head;
        head=head.next;
size--;
    }void deletelast(){
        if(head==null)return;
        if(head==tail)head=tail=null;
        Node temp=head;
        while(temp.next!=tail){
            temp=temp.next;
        }
        tail=temp;
        tail.next=null;
        temp=temp.next;
size--;
    }
    void deleteatpos(int p){
        if(head==null)return;
        
        Node temp=head;
        int i=1;
        while(i<p-1){
            temp=temp.next;i++;
        }
        Node temp2=temp.next;
        temp.next=temp2.next;
size--;
       
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

    void reverse(){
        
    Node agla=null;
    Node pechla=null;
    Node cur=head;
     tail = head;
    while(cur!=null){
        agla=cur.next;
        cur.next=pechla;
        pechla=cur;
        cur=agla;
    }
    head=pechla;
    }
}

public class SLL {
    
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.insertfirst(10);
        l.insertfirst(20);
        l.insertlast(80);
        l.insertlast(90);
       
        // l.deleteatpos(3);
        // l.deletefirst();
        l.deletelast();
        
       
   l.display();
   System.out.println(l.size);
   l.reverse();
   l.display();
    }    
}
