package LINKED_LIST;
//class Node{
//    int val;
//    Node next;
//    Node(int val){  // constructor
//        this.val=val;
//    }
//}

public class ListNodeClass {
    public static void main(String[] args) {
        //assign  value
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        //link with one another ;
        a.next=b; //10 -> 20
        b.next=c; //10-> 20 -> 30
        c.next=d; //10->20->30->40
        d.next=e; //10->20->30->40->50
        //now print
        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(a.next.next.next.val);
        System.out.println(a.next.next.next.next.val);
    }
}