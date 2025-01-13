package Recursion;

public class SkipCharacter {
    public static void Skip(int i,String s,String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        if(s.charAt(i)  !='a'){
            ans=ans+s.charAt(i);
        }
        Skip(i+1,s,ans);
    }
    public static void main(String[] args){
        String s="jayant pradhan "; // jynt prdhn
        Skip(0,s,"");
    }
}