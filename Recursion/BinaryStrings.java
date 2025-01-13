//generate all string without consecutive 1's .
package Recursion;
import java.util.Scanner;
public class BinaryStrings {
    public static void PrintString(String s,int n){
        int m=s.length();
        if(m==n){
            System.out.println(s);
            return;
        }
        if(m==0 || s.charAt(m-1)=='0') {
            PrintString(s+1,n);
            PrintString(s+0,n);
        }
        else
            PrintString(s+0,n);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        PrintString("",n);

    }
}
