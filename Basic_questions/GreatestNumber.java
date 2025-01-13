//take 3 positive integer input and print the greatest of them .
package Basic_questions;
import java.util.Scanner;
public class GreatestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter value of b");
        int b = sc.nextInt();
        System.out.println("enter value of c");
        int c = sc.nextInt();
//        if(a>b && a>c){
//            System.out.println(a);
//        }
//        else if(b>=a &&  b>=c){
//            System.out.println(b);     //method one
//        }
//        else {
//            System.out.println(c);
//        }

        if (a > b) {    //a=5 b=6 c=7
            if (a > c) {
                System.out.println(a);
            } else System.out.println(c);
        } else {
            if (b > c) {
                System.out.println(b);     // 2nd approach
            }
            else System.out.println(c);
        }

    }




    }




