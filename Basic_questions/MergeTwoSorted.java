//merge two sorted array in one single array
package Basic_questions;
import java.util.Scanner;
public class MergeTwoSorted {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array");
        int n=sc.nextInt();
        int[] A=new int[n];
        int[] B=new int[n];
        System.out.println("enter element of array 01:");
        for(int i=0;i<A.length;i++){
            A[i]=sc.nextInt();
        }
        //input code
        System.out.println("enter element of array 02 :");
        for(int i=0;i<B.length;i++){
            B[i]=sc.nextInt();
        }
        int[] ans=new int[A.length + B.length];
        int i=0 ,j=0 , k=0;
        //merging
        while(i<A.length && j<B.length){
            if(A[i] <= B[j]){
                ans[k]=A[i];
                i++;
            }
            else{
                ans[k]=B[j];
                j++;
            }
            k++;
        }
        if(i==A.length){ //now take elements from b only
            while(j<B.length){
                ans[k]=B[j];
                j++; k++;
            }
        }
        if(j==B.length) {
            while (i < A.length) { //now take element from a only
                ans[k] = A[i];
                i++; k++;
            }
        }
        for(int ele :ans){
            System.out.print(ele + " ");
        }
    }

}
