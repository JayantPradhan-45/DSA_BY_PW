//take a positive integer input and
// tell if it is a five digit number or not
package Basic_questions;
import java.util.Scanner;
public class FiveDigitNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>9999 && n<99999) System.out.println("it is a 5 digit number");
        else System.out.println("not a 5 digit number");
    }
}
