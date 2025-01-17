import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int NumberOfDigit=0;

        while(n>0){
            n=n/10;
            NumberOfDigit++;  //NumberOfDigit=NumberOfDigit+1;


        }
        System.out.println("number of digit in" +n +  "=" +NumberOfDigit);
    }


}
