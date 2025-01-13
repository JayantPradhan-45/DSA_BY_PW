//find the maximum value out of all the elements in the array.
package Basic_questions;
import java.util.Scanner;
public class MaximumValueInArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //solution
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] >max){  // this is for maximum value
                max=arr[i];
            }
        }
        int smx=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            if (arr[i] > smx && arr[i] != max) {   // this is for second maximum value

                    smx = arr[i];
                }
            }
        System.out.println(max);
        System.out.println(smx);
    }



}
