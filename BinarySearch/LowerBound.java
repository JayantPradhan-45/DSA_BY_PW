package BinarySearch;
public class LowerBound {
    public static void main(String[] args){
        int[] arr={10,23,45,67,78,99};
        int n=arr.length;
        int target=25;  //answer should be 4
        int lowerbound =n;
        int low =0 , high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;  // or int mid = (low + high)/2;
            if(arr[mid]>=target) {
                lowerbound=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(lowerbound);
    }
}
