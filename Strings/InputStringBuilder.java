package Strings;
import java.util.Scanner;
public class InputStringBuilder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // method number one
        System.out.println("enter a string");
        String s=sc.nextLine();
        StringBuilder st=new StringBuilder(s);
        System.out.println(s);
        st.setCharAt(3,'z'); // this function is used for modifying individual character of string builder
        System.out.println(st);
    }
}
