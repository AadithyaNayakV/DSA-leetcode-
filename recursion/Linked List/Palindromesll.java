
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
void palin(){
    Node slow=head;
    Node fast =head;
    while(fast.next!=null&&fast.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    Node temp=slow.next;
    Node prev=null;
    Node agla=null;
    Node cur=temp;
    while(cur!=null){
        agla=cur.next;
        cur.next=prev;
        prev=cur;
        cur=agla;

    }
    temp=prev;
    slow.next=temp;
    Node temp1=head;
    while(temp!=null){
        if(temp1.val==temp.val){
            temp1=temp1.next;
            temp=temp.next;
        }
        if(temp1.val!=temp.val)return false;

    }

}
return true;
}
public class Palindromesll {
    
}
