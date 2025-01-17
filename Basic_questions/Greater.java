//write a function which take 2 number and return the greater of those two :
import java.util.Scanner;
// class CheckGreater{
//     int Great(int x ,int y){
//         if(x>y){
//             System.out.println(x);

//         }

//     }
// }
public class Greater{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // CheckGreater sc=new CheckGreater();
        int a=sc.nextInt();
        int b=sc.nextInt();
        // obj.Great(a,b);
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }

    }
}