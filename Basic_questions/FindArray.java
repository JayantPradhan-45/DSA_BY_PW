//find the element 'x' in the array . take array and x as input .
package Basic_questions;

import java.util.Scanner;
public class FindArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of an array");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.println("enter x for check that is belongs to array or not");
        int x=sc.nextInt();

        System.out.println("enter element of array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();    //input array
        }
        //solution
        boolean flag=false; //not found
        for(int i=0;i<n;i++){
            if(x==arr[i]){
               flag=true;
                break;

            }

        }
        if(flag==true) System.out.println("element found ");
        else System.out.println("not found ");
    }
}