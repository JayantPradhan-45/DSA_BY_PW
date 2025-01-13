package BinarySearch;
public class Bs {
    public static void main(String[] args){
        int[] arr={10,23,45,67,78,99};
        int n=arr.length;
        int target=8;
        int low=0;
        int high=n-1;
        boolean flag=false; //false means is not present in array
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                flag=true;
                break;
            }
            else if(arr[mid]>target) high=mid-1;
            else if(arr[mid]<target) low=mid+1;

        }
        if(flag==true) System.out.println("target present");
        else System.out.println("target not present");

    }
}
