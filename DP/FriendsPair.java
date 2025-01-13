package DP;
//you  are given a number 'n' , Denoting that there are 'n' friends .
//find out the number of ways in which a person can either pair up or stay single\
//formula  = pair(n) =pair(n-1) + (n-1)* pair(n-2);

import java.util.Arrays;
import java.util.Scanner;

public class FriendsPair {
    static int[] dp;
    public static int pair(int n){
        if(n<=2){
            return n;
        }
        if(dp[n] != -1) return dp[n];
        return dp[n] = pair(n-1) + (n-1) * pair(n-2);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
         dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(pair(n));

    }

}
