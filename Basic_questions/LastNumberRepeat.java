import java.util.Scanner;
public class LastNumberRepeat{
    public static int RepeatElement(int[] arr){
        int ans;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    //pending for find last repeated number in given array  :
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter " + n + "element" );
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("final result is :" + RepeatElement(arr));
    }
}

