//make a function which calculates the factorial of n using recursion.
package Recursion;
import java.util.Scanner;
public class Factorial {
    static int Fact(int n){
        if(n==1 || n==0) return 1; //base case
        int ans=n * Fact(n-1); //call
        return ans;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println(Fact(n));


    }
}
