//input a string and update all the even position in the string
//to character 'a' ,consider 0 based indexing.
package Strings;
import java.util.Scanner;
public class UpdateStringCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String s = sc.nextLine();
        String N = " ";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                N = N + 'a';
            } else {
                N = N + s.charAt(i);
            }

        }
        System.out.println(N +" ");
    }
}
