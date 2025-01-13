package Basic_questions;
//take positive integer  input and tell if it is divisible by 5 or 3.
import java.util.Scanner;
public class Divisible01 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();  //20
        if(n%5==0 || n%3==0) System.out.println("divisble by 5 or 3");
        else System.out.println("not divisible by 5 or 3");
    }       //true    //false

}
