package Heaps;
//user define class
class MinHeap{
    private int[] arr;
    private int size;
    //constructor
    MinHeap(int capacity){
        arr=new int[capacity];
        size=0;
    }
    //for add functions
    public void add(int num){
        arr[size++]=num;
        upheapify(size-1);
    }
    public void upheapify(int idx){
        if(idx==0) return; // base case of recursion
        int parent = (idx-1)/2;
        if(arr[idx] < arr[parent]){
            swap(idx,parent);
            upheapify(parent);
        }
    }
    public void swap(int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public int peek(){
        if(size==0){
            System.out.println("heap is empty");
            return -1;
        }
        return arr[0];
    }
    public int size(){
        return size;
    }
}
public class MinHeapImplementationByArray {
    public static void main(String[] args){
        MinHeap pq=new MinHeap(5);
        pq.add(1);
        pq.add(2);
        pq.add(4);
        System.out.println(pq.peek());


    }
}
