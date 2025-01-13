package LINKED_LIST;

public class DisplayingValue {
    public static void Print( Node head){
        Node temp=head;
        while(temp != null){
            System.out.println(temp.val);
            temp=temp.next;

        }
    }
    public static void main(String[] args){
        Node a=new Node(34);
        Node b=new Node(45);
        Node c=new Node(12);
        Node d=new Node(90);
        Node e=new Node(56);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Print(a);
    }

}

