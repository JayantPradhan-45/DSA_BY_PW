//input a string and print all the sub strings of that string.
package Strings;
import java.util.Scanner;
public class PrintSubString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String a=sc.nextLine();
        int n=a.length();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.print(a.substring(i,j) + " ");
            }
            System.out.println();
        }

    }
}
