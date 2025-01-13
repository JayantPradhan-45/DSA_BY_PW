package Recursion;
import java.util.Scanner;
public class CalculatePower02 {
    public static int Power(int a, int b){
        if(b%2 !=0 ){
            int ans=Power(a,b/2);
            return ans*ans * a;
        }  // this code is better than first one
        if(b==0) return 1;
        int ans=Power(a,b/2);
        return ans*ans;
    }  //Tc = O(log b)
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base");
        int a=sc.nextInt();
        System.out.println("enter power");
        int b=sc.nextInt();
        System.out.println(Power(a,b));
    }
}
