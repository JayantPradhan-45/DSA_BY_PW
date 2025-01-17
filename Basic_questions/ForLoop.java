import java.util.Scanner;
//print reverse  number using for loop
public class ForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number : ");
        int n=sc.nextInt();



        for(int num=n;num>=0;num--  ){
            System.out.println(num);


        }

    }
}
