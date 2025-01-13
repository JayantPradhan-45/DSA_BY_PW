package DP;

public class Knapsack {
    public static int Profit(int idx ,int[] value ,int[] wight , int C,int[][] dp){  // c is for capacity
        if(idx == value.length) return 0;
        if(dp[idx][C]!=-1) return dp[idx][C];
        int skip = Profit(idx+1,value,wight,C,dp);

        if(wight[idx] > C) return dp[idx][C]=skip;

        int pick = value[idx] + Profit(idx+1,value,wight,C-wight[idx],dp);

        return dp[idx][C]=Math.max(pick,skip);

    }
    public static void main(String[] args){
        //given
        int[] value ={5,3,7,16};
        int[] wight = {1,2,8,10};
        int C=8;
        int n=wight.length;
        //i--> n-1 | C-> 0 to C or C t0 0;
        int[][] dp=new int[n][C+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(Profit(0,value,wight,C ,dp));


    }
}
