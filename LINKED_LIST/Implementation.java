package LINKED_LIST;
class SLL {  // user define data structures 
    private Node head; // head=null
    private Node tail; // tail==null
    private int size; // size= 0;
    void insertAtEnd(int val){  // this method is for insert any value at the end of LL
        Node temp=new Node(val);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
        size++;

    }
    void insertAtHead(int val){ // this method is for insert any value at the starting position
        Node temp=new Node( val);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void insert(int idx,int val){  // using this method we can insert any value at any position of Ll
        //base case
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx==size){
            insertAtEnd(val);
            return;
        }
        if(idx >size || idx < 0){
            System.out.println("invalid index !");
            return ;
        }
        Node temp=new Node(val);
        Node x=head;
        for(int i=1;i<=idx-1;i++){
            x=x.next;
        }
        //insertion
        temp.next=x.next;
        x.next=temp;
        size++;
    }
    int Get(int idx) throws Error{
        //base case
        if(idx==size-1) return tail.val;
        if(idx >=size || idx < 0){
           throw new Error("bhai error aa raha hai yaar index ko thik karde jaldi ");
        }
        Node temp=head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    void Set(int idx,int val ) throws Error{ // this method is uses for set any value with change that particular index
        //base case
        if(idx==size-1){
            tail.val=val;
        }
        if(idx >=size || idx < 0){
            throw new Error("bhai error aa raha hai yaar index ko thik karde jaldi ");
        }
        Node temp=head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        temp.val=val;
    }
    void DeleteIndex(int idx){

        //base case
        if(head==null){
            System.out.println("list is empty");
        }
        if(idx <0 || idx>=size){
            System.out.println("invalid index");
        }
        Node temp=head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        if(temp.next==tail) tail=temp;
        temp.next=temp.next.next;
        size--;
    }
    void Display(){  // this method is uses for display the final output
        Node temp=head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp=temp.next;
        }
        System.out.println();
    }
    void size(){   // this method is uses for size
        System.out.println("size :" +size);
    }
}
public class Implementation {
    public static void main(String[] args){
        SLL list=new SLL();
        list.insertAtEnd(10);
        list.insertAtEnd(30);
        list.insertAtEnd(20);
        list.insertAtEnd(90);
        list.insertAtEnd(60);
        list.Display();
        list.insert(2,34);
        list.Display();

        System.out.println(list.Get(2));
        //System.out.println(list.Get(-1));
        list.Display();
        list.Set(2,88);
        list.Display();
        list.DeleteIndex(3);
        list.Display();
   

    }
}
