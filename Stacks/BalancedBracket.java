package Stacks;
import java.util.Stack;
import java.util.Scanner;
public class BalancedBracket {
    public static boolean  IsBalanced(String str){
        //create new stack
        Stack<Character> st=new Stack<>();
        int n=str.length();

        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='(') st.push(ch);
             else{
                 if(st.size()==0) return false;
                 if(st.peek()=='(') st.pop();
            }

        }
        if(st.size() > 0) return false;
        else return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
        System.out.println(IsBalanced(str));


    }
}
