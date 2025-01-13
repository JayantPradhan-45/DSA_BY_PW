package Recursion;
import java.util.Scanner;
public class Sum1ToN02 {
    public static int Sum(int n){
        if(n==0 || n==1) return n; //base case
        return n + Sum(n-1); // work and call 
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println(Sum(n));


    }
}
