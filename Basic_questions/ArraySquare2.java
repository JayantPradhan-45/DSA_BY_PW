//given an integer array 'a ' sorted in non-decreasing order,
// return an array of the square of each number sorted in non-decreasing order.
import java.util.Scanner;
public class ArraySquare2{
    static void PrintArray(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    static void Swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void ReverseArray(int[] arr){
        int n=arr.length;
        int i=0,j=n-1;
       
        while(i<j){
           Swap(arr, i, j);
            i++;
            j--;
        }
    }    
    static int[] SquareOfArray(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        int left=0,right=n-1,k=0;
        

       
        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++]=arr[left]*arr[left];
                left++;
            }else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter" + n + " element ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Orignal array ");
        PrintArray(arr);
        ReverseArray(arr);
        int[] ans=SquareOfArray(arr);
        // ReverseArray(ans);
        System.out.println("Sorted array ");
        PrintArray(ans);
    }
    
   
}