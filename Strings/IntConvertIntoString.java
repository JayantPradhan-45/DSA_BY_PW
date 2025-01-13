//take interger input and convert it into a string
package Strings;
import java.util.Scanner;
public class IntConvertIntoString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a integer");
        int n=sc.nextInt();
        String s="";
        s=s+n;
        System.out.println(s);

    }
}
