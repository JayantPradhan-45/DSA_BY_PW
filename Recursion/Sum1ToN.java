package Recursion;
import java.util.Scanner;
public class Sum1ToN {
    public static void Sum(int i, int n,int sum){
       if(i==n){
           sum +=i;
           System.out.println(sum);
           return;
       }
       sum+=i;
       Sum(i+1,n,sum);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=1;
        int sum=0;
        System.out.println("enter n");
        int n=sc.nextInt();
        Sum(i,n,sum);

    }
}
