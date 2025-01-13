//  given a m*n gird you have to reach
//  from top left corner to bottom right corner.
//  you can go either down or right at a time   .
//  find the number of path
package Recursion;
import java.util.Scanner;
public class MazePathImportant {
    static int MazeWays(int row, int col,int m,int n){
        if(row==n || col==n) return 1;
        int RightWays=MazeWays(row+1,col,m,n);
        int DownWays=MazeWays(row,col+1,m,n);
        return RightWays+DownWays;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter m");
        int m =sc.nextInt();
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println(MazeWays(1,1,m,n));
    }
}
