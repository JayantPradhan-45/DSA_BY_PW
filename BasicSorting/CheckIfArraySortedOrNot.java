package BasicSorting;
//import java.util.Scanner;
public class CheckIfArraySortedOrNot {
    public static void main(String[] args){
      //  Scanner sc=new Scanner(System.in);
        int[] a={2,3,5,6,8};
        int n=a.length;
        boolean flag=true;  //true means sorted
        for(int i=0;i<n-1;i++){
            if(a[i] > a[i+1]){
                flag=false; //false means unsorted .
                break;
            }
        }
        if(flag==true) System.out.println("sorted");
        else System.out.println("unsorted");
    }
}
