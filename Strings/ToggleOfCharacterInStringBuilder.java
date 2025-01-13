//input a string and toggle all the character of it. ( replace small case with capital case and vise versa)
package Strings;
import java.util.Scanner;
public class ToggleOfCharacterInStringBuilder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a stringBuilder");
        StringBuilder st=new StringBuilder(sc.nextLine());
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            int ascii=(int)ch;
            if(ascii >=65 && ascii <=90){ //capital letter
                ascii +=32;
                ch=(char)ascii;
                st.setCharAt(i,ch);

            }
            else if(ascii >=97 && ascii <=122){ // small letter
                ascii -=32;
                ch=(char)ascii;
                st.setCharAt(i,ch);

            }

        }
        System.out.println(st);

    }
}
