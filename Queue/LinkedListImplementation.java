package Queue;

public class LinkedListImplementation {  //you tube by raghav sir
    public static class Node{  //user define data type
        int val;
        Node next;
        Node(int val){ //constructor
            this.val=val;
        }
    }
    public static class queueLL{ // user define data structure
        Node head=null;
        Node tail=null;
        int size=0;
        public void add(int x){
            Node temp=new Node(x);
            if(size==0){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;

        }
        public int peek(){
            if(size==0){
                System.out.println("empty queue");
                return -1;
            }
            return head.val;
        }
        public int remove(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            else{
                int x=head.val;
                head=head.next;
                size--;
                return x;
            }
        }
        public void display(){
            if(size==0){
                System.out.println("queue is empty");
            }
            else{
               Node temp=head;
               while(temp != null){
                   System.out.print(temp.val + " ");
                   temp=temp.next;
               }
               System.out.println();
            }
        }
    }

    public static void main(String[] args){
        queueLL q1=new queueLL();
        q1.display();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.display();
        q1.remove();
        q1.display();
        System.out.println(q1.peek());
        System.out.println(q1.size);

    }
}
