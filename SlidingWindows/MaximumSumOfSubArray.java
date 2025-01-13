package SlidingWindows;
//maximum sum sub array of size k;
public class MaximumSumOfSubArray { // bad code
    public static void main(String[] args){
        int[] arr={10,20,1,3,-40,80,10};
        int k=3;
        int n=arr.length;
        int maxsum=0;
        for(int i=0;i<n-k+1;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum +=arr[j];

            }
            maxsum=Math.max(maxsum,sum);
        }
        System.out.println(maxsum);


    }
}
