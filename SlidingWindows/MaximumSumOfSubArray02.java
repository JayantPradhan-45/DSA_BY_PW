package SlidingWindows;

public class MaximumSumOfSubArray02 {
    public static void main(String[] args){
        int[] arr={10,20,1,3,-40,80,10};
        int n=arr.length;
        int k=3;
        int maxsum=0;
        int i=0,j=k-1;
        int sum=0;
        for(int a=0;a<=k-1;a++){ // k times -- O(k)
            sum +=arr[a];
        }
        i++ ; j++;
        while(j<n){
            sum=sum - arr[i-1] +arr[j];
            maxsum=Math.max(maxsum,sum);
            i++ ; j++;
        }
        System.out.println(maxsum);
    }
}
