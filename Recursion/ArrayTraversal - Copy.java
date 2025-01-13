package Recursion;

public class ArrayTraversal {
    public static void Print(int i,int[] arr){
        if(i==arr.length){
            return;
        }
        System.out.print(arr[i] +" ");
        Print(i+1,arr);
    }
    public static void main(String[] args){
        int[] arr={4,3,5,1,2,8,9,6};
        Print(0,arr);
    }
}
