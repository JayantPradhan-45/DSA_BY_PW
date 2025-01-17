import java.util.Scanner;

public class DecimalNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int binary_num=sc.nextInt();
        int sum=0;
        int PW=1;
        while(binary_num>10){
            int unitDigit=binary_num%10;
            sum +=(unitDigit*PW);
            binary_num /=10;
            PW *=2;
        }
        System.out.println(sum);

    }
}
