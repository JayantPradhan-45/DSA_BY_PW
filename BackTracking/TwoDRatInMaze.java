package BackTracking;
import java.util.Scanner;
//2 direction
public class TwoDRatInMaze {
    public static int MazePath(int sr,int sc,int er,int ec){
        if(sr > er || sc > ec) return 0;
        if(sr == er  || sc==ec) return 1;

        //using recursion we fill find rightways and down ways
        int rightways=MazePath(sr,sc+1,er,ec);
        int downways=MazePath(sr+1,sc,er,ec);
        int TotalWays=rightways + downways;
        return TotalWays;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row ");
        int r=sc.nextInt();
        System.out.println("enter column");
        int c=sc.nextInt();
        int count=MazePath(1,1,r,c);
        System.out.println(count);

    }
}
