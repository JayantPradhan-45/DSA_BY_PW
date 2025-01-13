//  given an array of marks of students.
// if the mark of any student is less than 35 print its roll number.
// [ roll number here refers to the index of the array
package Basic_questions;
import java.util.Scanner;
public class MarksOfArray{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("enter sixe of an array");

        int n=sc.nextInt();

        System.out.println("enter array");

        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){

            if(arr[i]<=35){

                System.out.println(i);
            }
        }





    }


}