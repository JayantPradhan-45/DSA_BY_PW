package BinarySearch;
public class UpperBound {
    public static void main(String[] args){
        int[] arr={10,23,45,67,78,99};
        int n=arr.length;
        int target=45;
        int upperbound =n; 
        int low =0 , high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;  // or int mid = (low + high)/2;
            if(arr[mid]>target) {
                upperbound=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        System.out.println(upperbound);
    }
}