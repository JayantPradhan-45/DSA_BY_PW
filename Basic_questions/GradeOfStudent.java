//take input percentage of a student and
// print the grade according to mark:
//1>81-100 -- very good
// 2> 61-80 -- good
// 3> 41- 60 -- average
// <=40 -- fail
package Basic_questions;
import java.util.Scanner;
public class GradeOfStudent {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter mark of a student");
        int n=sc.nextInt();
        if(n>=81) System.out.println("very good");
        else if(n>=61) System.out.println("good"); // if ( if condition is false then else if condition will work )
                                                            // if( if condition is true then else if conition will not work)
        else if(n>=41) System.out.println("average");
        else System.out.println("fail");

    }
}
