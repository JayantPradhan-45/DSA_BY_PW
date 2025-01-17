import java.util.Scanner;
public class AdditionMatrix {
    static void PrintMatrix(int[][] arr){
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " " );
            }
            System.out.println();
        }
    }
    static void Addition(int[][] a,int r1,int c1,int[][] b, int r2,int c2){
        if(r1 !=r2 || c1 !=c2){
            System.out.println("wrong input - Addition is not possible :");
            return ;
        }
        int[][] sum=new int[r1][c1];
        for(int i=0;i<r1;i++){ //number of row
            for(int j=0;j<c1;j++){   //number of column
                sum[i][j]=a[i][j]+b[i][j];
            }
            System.out.println("sum of matrix 1 and matrix 2 ");               //not working properly :
            PrintMatrix(sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows and coulmn :");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int[][] a=new int[r1][c1];
        System.out.println("enter " + r1*c1 + " matrix value");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter number of matrix 2 ");
        int r2=sc.nextInt();
        int c2=sc.nextInt();
        int[][] b=new int[r2][c2];
        System.out.println("enter " + r2*c2 + " matrix value");
        for(int i=0;i<r2;i++) {
            for (int j = 0;j<c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        PrintMatrix(a);
        System.out.println("Matrix 1");
        PrintMatrix(b);
        Addition(a,r1,c1,b,r2,c2);
    }
}