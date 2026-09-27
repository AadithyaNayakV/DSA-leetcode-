import org.w3c.dom.Node;

public class combination2 {
    public static void main(String[] args) {
    }

    int helper(){
       Node cur=head;

       Node tail=head;

       while(cur!=null){}
       if(cur.child==null){
        tail=curr;
        cur=cur.next;continue;
       }

       Node child=cur.child;
       Node next=cur.next;
       curr.next=child;
       curr.child=null;
       Node ch=helper(child);
       ch.next=next;
       if(next!=null)next.prev=chi;
       tail=ch;
       cur=next;
    }


}
