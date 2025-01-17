//factorial of n using recursion .

import java.util.Scanner;

public class FactorialRecur {
    static int Factorial(int n){
        //base case
        if(n==0) return 1;
        //smaller problem - recursive work.
        int Answer=n*Factorial(n-1);  //factorial 4!.
        //big problem - self work.
       //4!*n;
        return Answer;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println(Factorial(n));
    }
}
