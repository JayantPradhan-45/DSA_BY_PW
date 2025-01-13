//take integer 'x' as input and print half of the number.
package Basic_questions;
import java.util.Scanner;
public class typecasting {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of x : ");
//        int x=sc.nextInt();
//        System.out.println(x/2);  // wrong approach

        int x=sc.nextInt();
        double y=(double)x;  // x is assign int to double  then double is assign to y.     // typecasting
        System.out.println(y/2);


    }
}
