package Heaps;
import java.util.PriorityQueue;
import java.util.Collections;

//using max heap which is best TC
public class KthSmallestElement02 {
    public static void main(String[] args){
        int[] arr={10,2,8,3,-6,-2,9,-12};
        int k=4;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){
            pq.add(ele);
            if(pq.size() > k){
                pq.remove();
            }
        }
        System.out.println(pq.peek());

    }
}
