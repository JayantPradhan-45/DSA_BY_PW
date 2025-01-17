//sum of 2 nummber using function .
import java.util.Scanner;
public class Function{
    public static int CalculateSum(int a, int b){
        int sum=a*b;
        
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a:");
        int a=sc.nextInt();
        System.out.println("enter b :");
        int b=sc.nextInt();
        // CalculateSum(a,b);
        // System.out.println(CalculateSum);
        System.out.println(CalculateSum(a, b));


    }
}