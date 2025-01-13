//input a string and count all the vowels in the given string
package Strings;
import java.util.Scanner;
public class VowelStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character");
        String str=sc.nextLine();
        int n=str.length();
        int count=0;
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(isvowel(ch)==true){
                count++;
            }
        }
        System.out.println(count);
    }
    static boolean isvowel(char ch ){
        if(ch=='a' || ch=='A') return true;
        if(ch=='e' || ch=='E') return true;
        if(ch=='i' || ch=='I') return true;
        if(ch=='o' || ch=='O') return true;
        if(ch=='u' || ch=='U') return true;
        else{
            return false;
        }
    }
}
