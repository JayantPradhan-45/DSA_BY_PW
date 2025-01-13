package Basic_questions;
import java.util.Scanner;
public class MergeTwoSortedArrayOpposite {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a={10,20,30,40,50};
        int[] b={16,17,80,135,150};
        int i=a.length-1;
        int j=b.length-1;
        int[] c=new int[a.length+b.length];    //i want to put reverse value in array
        int k=c.length-1;
        while(i>=0 && j>=0){
            if(a[i] >=b[j]){
                c[k]=a[i];
                i--;
                k--;
            }   //wrong code
            //
            if(b[j]>=a[i]){
                c[k]=b[j];
                j--;
                k--;
            }
        }
        if(a[i]==0){
            while(i>=0){
                c[k]=b[j];
                j--;
                k--;
            }
        }
        if(b[j]==0){
            while(j>=0){
                c[k]=a[i];
                i--;
                k--;
            }
        }
        for(int ele : c){
            System.out.print(ele +" ");
        }


    }
}
