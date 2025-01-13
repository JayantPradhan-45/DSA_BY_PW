//sort the array 0's and 1's.
package Basic_questions;
import java.util.Scanner;
public class SortZeroAndOne{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter element of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //solution method --1
        int NumberOfZero=0;
        //int NumberOfOne=1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                NumberOfZero++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<NumberOfZero) arr[i]=0;
            else arr[i]=1;
            System.out.print(arr[i] + " ");
        }
        //method 2
//        int i=0 ,j=n-1;
//        while(i<j){
//            if(arr[i]==0) i++;
//            if(arr[j]==1) j--;
//            if(i<j && arr[i]==1 && arr[j]==0) {
////                swap(arr[i],arr[j]);
//                arr[i] = 0;
//                arr[j] = 1;
//                i++;
//                j--;
//            }
//        }
//        for( i=0;i<n;i++){
//            System.out.print(arr[i]);
//        }
    }
}
