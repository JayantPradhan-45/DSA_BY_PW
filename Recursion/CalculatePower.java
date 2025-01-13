package Recursion;
import java.util.Scanner;
public class CalculatePower {
    static int Power(int a, int b){
//        if(a==0 && b==0){
//            System.out.println("not define");
//            return -1;
//        }
        if(b==0) return 1;
        return a* Power(a,b-1);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a =sc.nextInt();
        System.out.println("enter b");
        int b=sc.nextInt();
        System.out.println(Power(a,b));
    }
}
