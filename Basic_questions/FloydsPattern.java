
package Basic_questions;
import java.util.Scanner;
public class FloydsPattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++){ //row
            for(int j=1;j<=i;j++){ //column

                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }
}
