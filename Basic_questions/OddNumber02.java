package Basic_questions;
public class OddNumber02 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%2==0){
                continue;    // skip even numbers and print odd numbers
            }
            System.out.println(i);
        }
    }
}
