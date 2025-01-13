// print sum of the digits of given number
package Basic_questions;
import java.util.Scanner;
public class SumOfNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            int Lastdigit=n%10;
            sum+=Lastdigit;
            n/=10;
        }
        System.out.println(sum);
    }
}
