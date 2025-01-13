package Recursion;
import java.util.Scanner;
public class HighestCommonFactor {
    public static int GCD(int a ,int b ){
        for(int i=Math.min(a,b);i>=1;i--){
            if(a%i==0 && b%i==0) return i;
        }  //using for loop
        return 1;
    }
    public static int HCF(int a, int b){
        if(b%a==0) return a;
        return HCF(b%a,a);  // using recursion
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        int a =sc.nextInt();
        System.out.println("entr b");
        int b=sc.nextInt();
        System.out.println(HCF(a,b));
    }
}
