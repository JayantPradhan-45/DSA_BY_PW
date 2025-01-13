package Basic_questions;
import java.util.Scanner;
public class SpecialPattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(2*j-1 + " ");  // math approach
            }
            System.out.println();
        }

//        for(int i=1;i<=n;i++){
//            int a=1;
//            for(int j=1;j<=i;j++){
//                System.out.print(j + " ");
//                a=a+2;     // without math approach
//            }
//            System.out.println();
//        }


    }

}
