package LINKED_LIST;
class dNode{
    int val;
    dNode next;
    dNode prev;
    dNode(int val){
        this.val=val;
    }
}
public class doublyLinkedListImplementation {
    public static void print(dNode head){
        dNode temp=head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void printReverse(dNode tail){
        dNode temp=tail;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp=temp.prev;
        }
        System.out.println();
    }
    public static void main(String[] args){
        dNode a=new dNode(20);
        dNode b=new dNode(30);
        dNode c=new dNode(40);
        dNode d=new dNode(50);
        //connection each other
        a.next=b; b.prev=a;
        b.next=c; c.prev=b;
        c.next=d; d.prev=c;
        print(a);
        printReverse(d);
    }
}
