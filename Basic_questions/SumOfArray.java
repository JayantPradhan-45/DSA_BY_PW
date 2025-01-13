//calculate the sum of all the elements in the given array
package Basic_questions;
import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        System.out.println("enter element");

        int[] arr = new int[n];
        int add = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  //input loop

        }
        for (int i = 0; i < n;i++) {

            add =add+arr[i];


        }
        System.out.print(add);


    }
}