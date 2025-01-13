package Recursion;

public class StringTraversal {
    public static void Print(int i, String s){
        if(i==s.length()) return;
        System.out.print(s.charAt(i));
        Print(i+1,s);
    }
    public static void main(String[] args){
        String s= "jayant pradhan";
        Print(0,s);
    }
}
