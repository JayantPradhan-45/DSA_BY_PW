//take a positive integer input and tell if it is even or odd.
package Basic_questions;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("it is a even number ");

        }
        else{
            System.out.println("it is a odd number ");
        }
    }

}
