package Heaps;
import java.util.PriorityQueue;

//using min heap which is more TC
public class KthSmallestElement {
    public static void main(String[] args){
        int[] arr={10,2,3,8,-4,-2,6};
        int k=3;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
       for(int ele : arr){
           pq.add(ele);
       }
       for(int i=1;i<=k-1;i++){
           pq.remove();
       }
       System.out.println(pq.peek());
    }
}
