//enter 3 numbers from the user and make a function to print their average.
import java.util.Scanner;
public class Average{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); 
        System.out.println("enter the value of counte :");
        int count=sc.nextInt();
        int number;
        int sum=0;
        float average;
        for(int i=0;i<count;i++){
            number=sc.nextInt();
            sum=sum+number;       //for find aveage :  
        }
        average =sum/count;
        System.out.println(average);

        



    }
}
