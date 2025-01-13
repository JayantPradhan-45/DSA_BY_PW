package Stacks;
class Stack{

}
public class LinkedListImplementation {
    public static class Node{ //user define data type
        int val;
        Node next;
        //constructor
        Node(int val){
            this.val=val;

        }

    }
    public static class LLStack{ //user define data structure
        Node head=null;
        int size=0;
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        void displayrec(Node h){
            if(h==null) return ;
            displayrec(h.next);
            System.out.print(h.val +" ");
        }
        void display(){
            displayrec(head);
            System.out.println();
        }
        void displayReverse(){
            Node temp=head;
            while(temp != null){

                System.out.print(temp.val + " ");
                temp=temp.next;
            }
            System.out.println();
        }
        int size(){ //getter
            return size();
        }
        int pop(){
            if(head==null){
                System.out.println("stack is empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            return x;

        }
        int peek(){
            if(head== null){
                System.out.println("stack is empty");
                return -1;
            }
            return head.val;
        }
        boolean isEmpty(){
            if(head==null){
                return true;
            }
            else{
                return false;
            }
        }

    }
    public static void main(String[] args){
        LLStack st=new LLStack();
        st.push(10);
        st.push(20);
        st.push(40);
        st.push(50);
        st.push(90);
        st.pop();
        st.pop();
        st.display();
        st.push(900);
        st.display();
        st.peek();
        st.display();
        System.out.println(st.peek());


    }
}
