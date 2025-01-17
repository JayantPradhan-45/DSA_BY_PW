import java.util.Scanner;

class div{
    int dov(int a ,int b){
        int ans=a/b;
        return ans;
    }
}




public class Division {
    public static void main(String[] args){

        div object=new div();    //constructor or object create :
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a :");
        int a=sc.nextInt();
        System.out.println("enter b :");
        int b=sc.nextInt();
        int solve=object.dov(a,b); //call
        System.out.println(solve);



    }
}
