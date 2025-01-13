//display GP 3 12 48 upto 'n' terms
package Basic_questions;
import java.util.Scanner;
public class GP02 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();

        //3 12  48 ..
        int a=3;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a=a*4;
        }


    }
}
