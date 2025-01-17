//find the unique number in a given array where all the elements are begin repeated twice with one value begin  unique
import java.util.Scanner;
public class ArrayQuestion{
    public static int  UniqueNumber(int[] array){
        int n=array.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(array[i]==array[j]){
                    array[i]=-1;
                    array[j]=-1;                       //working 
                }                                                                 
            }
        }
        int sum=-1;
        for(int i=0;i<n;i++){
            if(array[i]>0){
                sum=array[i];                
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of  array :");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("enter the " + n + "element ");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("unique element " + UniqueNumber(array));

    }
}