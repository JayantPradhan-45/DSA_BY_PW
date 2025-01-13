package DP;
//subset sum ( tell if there exist a subset of the array with sum == target )
public class knapsack2 {
    public static void main(String[] args){
        int[] arr= {8,6,2,4};
        int target=10;
        int[][] dp= new int[arr.length][target+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(subset(0,0,arr,target,dp));


    }

    private static boolean subset(int idx, int sum, int[] arr, int target,int[][] dp) {
        if(idx==arr.length){
            if(sum==target) return true;
            else return false;
        }
        if(dp[idx][target] != -1 ) {
            if(dp[idx][target]==1) return true;
            else return false;

        }
        boolean ans=false;
        boolean skip=subset(idx+1,sum,arr,target,dp);
        if(sum+arr[idx] > target) return skip; //only valid for positive number
        else{
            boolean pick = subset(idx+1,sum,arr,target-arr[idx],dp);
            ans=pick || skip;
        }
        //boolean pick=subset(idx+1,sum+arr[idx],arr,target,dp);
        if(ans) dp[idx][target]=1;
        else dp[idx][target]=0;
        return ans;

        //return pick || skip;
    }
}
