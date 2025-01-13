package Recursion;
import java.util.Scanner;
public class GenerateParentheses {
    public static void PrintPara(int open , int close, int n, String s){
        if(s.length()==2*n){
            System.out.println(s);
            return;
        }
        if(open<n) PrintPara(open+1,close,n,s+"(");
        if(close<open) PrintPara(open,close+1,n,s+")");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        PrintPara(0,0,n,"");
    }
}
