package BackTracking;

import java.util.Scanner;

public class FourDMazePath {
    public static void MazePath(int sr,int sc,int er,int ec,String s,boolean[][] isVisited){
        if(sr <0 || sc <0 ) return ;
        if(sr > er || sc>ec) return ;
        if(isVisited[sr][sc]==true) return;



        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc]=true;
        //recursive call;
        //go right
        MazePath(sr,sc+1,er,ec,s+"R",isVisited);
        //go down
        MazePath(sr+1,sc,er,ec,s+"D",isVisited);

        //go left
        MazePath(sr,sc-1,er,ec,s+"L",isVisited);
        //go up
        MazePath(sr-1,sc,er,ec,s+"U",isVisited);
        //backtracking
        isVisited[sr][sc]=false;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row ");
        int r=sc.nextInt();
        System.out.println("enter column");
        int c=sc.nextInt();
        boolean[][] isVisited=new boolean[r][c];  //by default false were stored
        MazePath(0,0,r-1,c-1,"",isVisited);

    }
}
