package Basic_questions;
import java.util.Scanner;
public class Pattern01 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of row");
        int r=sc.nextInt();
        System.out.println("enter number of column");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
