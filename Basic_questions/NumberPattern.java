package Basic_questions;
import java.util.Scanner;
public class NumberPattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row");
        int r=sc.nextInt();
//        System.out.println("enter column");
//        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
