package Basic_questions;
import java.util.Scanner;
public class SortZeroAndOneAndTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter element ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int NOZ=0;
        int NOO=0;
        int NOT=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                NOZ++;
            }
            if(arr[i]==1){
                NOO++;
            }
            if(arr[i]==2){
                NOT++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<NOZ) arr[i]=0;
            else if(i<NOZ+NOO) arr[i]=1;
            else arr[i]=2;
            System.out.println(arr[i] + " ");
        }
    }
}
