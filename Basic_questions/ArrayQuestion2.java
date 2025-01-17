//find the maximum value in the given array :
import java.util.Scanner;
public class ArrayQuestion2{
    public static int MaximumNumber(int[] arr){        
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return maxi;
    }
    // public static int SecondMaximum(int[] args){
    //     int maxi=MaximumNumber(arr);
    //     for(int i=0;i<arr.length;i++){
    //        if(arr[i]==maxi){
    //         arr[i]=integer.MIN_VALUE;
    //        }
    //     }
    //     int SecondMaximum=MaximumNumber(arr);
    //     return SecondMaximum;
    // }   
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("the Maximum  number is : " +MaximumNumber(arr));
    }
}