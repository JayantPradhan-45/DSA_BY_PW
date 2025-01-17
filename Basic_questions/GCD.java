//given two number x and y. Find the greatest common divisior of x and y using recursion.

import java.util.Scanner;
public class GCD{

    static int GreatestCommonDivisior(int x ,int y){
      while (x%y!=0){
          int reminder=x%y;
          x=y;
          y=reminder;
      }
      return y;
      
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of x :");
        int x=sc.nextInt();
        System.out.println("enter value of y :");
        int y=sc.nextInt();
        System.out.println(GreatestCommonDivisior(x,y));


    } 
}