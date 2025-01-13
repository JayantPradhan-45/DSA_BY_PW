package Recursion;

public class Permutations {
    public static void PrintPermutations( String ans,String s){
        if(s.length() == 0){
            System.out.println(ans);
            return ;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String left=s.substring(0,i);
            String right=s.substring(i+1);
            PrintPermutations(ans+ch,left+right);

        }
                 // Time complexity -- O(n!) // bad tc
    }

    public static void main(String[] args){
        String s="abc";
        PrintPermutations("",s);
    }
}
