//return the total number of digit in a number without using any loop . hints - try using in built
// integer .toSorting() function
package Strings;
import java.util.Scanner;
public class NumberOfDigitInString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int n=sc.nextInt();
        String s="" +n;
        System.out.println(s);
        System.out.println(s.length());
    }
}
