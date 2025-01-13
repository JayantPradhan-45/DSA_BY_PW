package Recursion;
import java.util.Scanner;

public class NthStairPath {
    public static int  Stair(int n){
        if(n==1) return 1;
        if(n==2) return 2;
        //or
           // if(n<=2) return n;
        return Stair(n-1) + Stair(n-2);
    }
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println(Stair(n));

    }
}
    // HW -- 1 or 3 step