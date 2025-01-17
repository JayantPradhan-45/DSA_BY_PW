import java.util.Scanner;
//program to find the 1 to nth fibonacci number using recursion . .
public class FibonacciNumber {
    static int Fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){                 //working properly .
            return 1;
        }
//        int ans=Fibonacci(n-1);
//        ans=ans+Fibonacci(n-2);
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            System.out.println(Fibonacci(i));
        }
//        System.out.println(Fibonacci(n));

    }
}
