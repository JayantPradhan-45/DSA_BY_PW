//take a positive integer input and tell if it is divisible by 5 or not
package Basic_questions;
import java.util.Scanner;
public class Divisible {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n");
        int n=sc.nextInt();
        if(n%5==0) System.out.println("it is divisible by 5");
        else System.out.println("it is not divisible by 5");


    }

}
