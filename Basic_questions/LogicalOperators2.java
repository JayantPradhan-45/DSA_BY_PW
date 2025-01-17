import java.util.Scanner;

public class LogicalOperators2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num%3==0 || num%5==0){
            System.out.println(" answer found :" +num );

        }

    }
}
