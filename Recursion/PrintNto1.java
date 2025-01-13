package Recursion;
import java.util.Scanner;
public class PrintNto1 {
    static void Decrease(int n){
        if(n==0) return ;
        System.out.println(n);
        Decrease(n-1);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        Decrease(n);

    }

}
