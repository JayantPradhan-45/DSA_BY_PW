//print all even number from 1 to 100 using for loop
package Basic_questions;
//import java.util.Scanner;
public class EvenNumber {
    public static void main(String[] args){
//        for(int i=1;i<=100;i++){  //100 rounds
//            if(i%2==1){
//                System.out.println(i);
//            }
//        }

        for(int i=2;i<=100;i+=2){  // 50 rounds
                             // good approach
            System.out.println(i);
        }

    }
}
