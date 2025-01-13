package Recursion;
import java.util.Scanner;
public class Print1ToN {
    static void Increase(int  x,int n){
        if(x>n) return; //base case
        System.out.println(x); // work
        Increase(x+1,n); //call
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        Increase(1,n);

    }

}
