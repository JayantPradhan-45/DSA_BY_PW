//take 3 numbers input and tell if they can be sides of a triangle.
package Basic_questions;
import java.util.Scanner;
public class ValidTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first side ");
        int a=sc.nextInt();
        System.out.println("enter second side");
        int b=sc.nextInt();
        System.out.println("enter third number ");
        int c=sc.nextInt();
        if((a+b)>c && (b+c)>a && (c+a)>b) System.out.println("valid triangle");
        else System.out.println("not valid triangle");
    }
}
