//find the doublet in the Array whose sum is equal to the given value x.( two sum).
package Basic_questions;
import java.util.Scanner;
public class TwoSumArray{

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter size of an array");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter traget ");
        int x=sc.nextInt();
        System.out.println("enter element of array ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();  // input array
        }

        // soulution
        int sum;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(arr[i] + arr[j] == x){

                   System.out.println (i + " " + j );
                }

            }

        }
    }
}

