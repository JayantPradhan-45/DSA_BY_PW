package Heaps;
//sort a 'k' sorted array or ( sort a nearly sorted array );
import java.util.ArrayList;
import java.util.PriorityQueue;
public class KthSortedArray {
    public static void main(String[] args){
        int[] arr={6,5,3,2,8,10,9};
        int k=3;
        //using min heap
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int ele : arr){
            pq.add(ele);
            if(pq.size() > k){
                ans.add(pq.remove());

            }
        }
        while(pq.size() != 0){
           ans.add(pq.remove());
        }
        System.out.println(ans);

    }
}