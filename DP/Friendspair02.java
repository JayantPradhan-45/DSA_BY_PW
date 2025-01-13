package DP;
//tabulation method
import java.util.Arrays;
import java.util.Scanner;

public class Friendspair02 {
    static int[] dp;
    public static int pair(int n){
        if(n < 2 ) return n;
        dp[1]=1;
        if(n>1) dp[2]=2;
        if(dp[n] != -1 ) return dp[n];
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1] + (i-1) * dp[i-2];
        }
        return dp[n];



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
