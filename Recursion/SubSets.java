package Recursion;

import java.util.ArrayList;

public class SubSets {
    static ArrayList<String> arr=new ArrayList<>(); //global
    public static void PrintSubsets(int i,String s,String ans ){
        if(i==s.length()){
            arr.add(ans);
            return;  // base case
        }
        char ch=s.charAt(i);
        PrintSubsets(i+1,s,ans+s.charAt(i)); //take
        PrintSubsets(i+1,s,ans);  // not take

    }
    public static void  main(String[] args){
        String s="abc";
        arr=new ArrayList<>(); //reset
        PrintSubsets(0,s,"");
        System.out.print(arr);
    }
}
