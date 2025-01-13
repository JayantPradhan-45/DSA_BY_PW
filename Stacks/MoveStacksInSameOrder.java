package Stacks;
import java.util.Stack;
import java.util.Scanner;
public class MoveStacksInSameOrder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();

        System.out.println("enter the number ofelement you want to insert");
        int n=sc.nextInt();
        System.out.println("enter the element ");
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);



    }
}
