package BackTracking;
import java.util.Scanner;
//2 direction
public class TwoDPrintPath {
    public static void Print(int sr,int sc,int er,int ec,String s){
        if(sr > er || sc>ec) return ;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        //recursive call;
        //go down
        Print(sr+1,sc,er,ec,s+"D");
        //go down
        Print(sr,sc+1,er,ec,s+"R");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row");
        int row=sc.nextInt();
        System.out.println("enter column");
        int column=sc.nextInt();
        Print(1,1,row,column," ");


    }
}
