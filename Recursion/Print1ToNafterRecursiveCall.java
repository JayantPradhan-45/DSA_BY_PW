package Recursion;
import java.util.Scanner;
public class Print1ToNafterRecursiveCall {
    static void Print(int n){
        if(n==0) return;
//        System.out.println(n);
        Print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        Print(n);

    }
}
