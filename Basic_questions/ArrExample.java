import java.util.Scanner;
public class ArrExample {
     static int occurrences(int[] arr,int x){
         int count=0;
         for(int i=0;i<arr.length;i++){
             if(arr[i] == x){
                 count++;
             }
         }
         return count;
     } //program to count the number of occurrences of element of x in a given array
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array : ");

        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter " + n + " element " );
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int x=sc.nextInt();
        System.out.println("enter  x:");



        System.out.println( + occurrences(arr,x));


    }
}