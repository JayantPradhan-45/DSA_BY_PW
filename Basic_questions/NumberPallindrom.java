package Basic_questions;
import java.util.Scanner;
public class NumberPallindrom {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){ //row
            for(int j=1;j<=n-1;j++){ //space
                System.out.print(" "+ " ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j +" ");
            }
            System.out.println();



        }


    }
}
