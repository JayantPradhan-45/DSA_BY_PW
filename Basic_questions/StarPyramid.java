package Basic_questions;

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
//        for(int i=1;i<=n;i++){ // row loop
//            for(int j=1;j<=n-i;j++){ // space loop
//                System.out.print(" " + " ");
//            }     mathematic approach
//            for(int j=1;j<=2*i-1;j++){ //stars
//                System.out.print("*"+ " ");
//            }
//            System.out.println();
//        }
        int nsp=n-1;
        int nst=1;
        for(int i=1;i<=n;i++) { // row loop
            for (int j = 1; j <=nsp; j++) { // space loop
                System.out.print(" " + " ");
            }    // without mathematic approach
            for (int j = 1; j <=nst; j++) { //stars
                System.out.print("*" + " ");
            }
            System.out.println();
            nsp--;
            nst+=2;
        }
    }
}