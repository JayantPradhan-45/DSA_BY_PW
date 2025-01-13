package Queue;
public class ArrayImplementation {
    public  static class queueA{
        private int F=-1;
        private int R=-1;
        private int[] arr=new int[5];
        int size=0;
        public void add(int val){ // method
            if(R==arr.length-1){
                System.out.println("queue is full");
                return;
            }
            //base case
            if(F==-1){

                F=R=0;
                arr[0]=val;
            }
            else{
                arr[R+1]=val;
                R++;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }

            F++;
            size--;
            return arr[F-1];

        }

        public int peek(){
            if(size==0){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[F];
        }
        public void Display(){
            if(size==0){
                System.out.println("queue is empty");
            }
            else{
                for(int i=F;i<=R;i++){
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        queueA q =new queueA();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(45);

        q.Display();
        q.remove();
        q.Display();
    }
}
