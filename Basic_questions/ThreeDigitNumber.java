//take a positive integer input
// and tell it is a three digit number or not.
package Basic_questions;
import java.util.Scanner;
public class ThreeDigitNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 digit number");
        int n=sc.nextInt();
        if(n>99 && n<1000) System.out.println("it is 3 digit number ");
        else System.out.println("not a three digit number ");
    }
}
