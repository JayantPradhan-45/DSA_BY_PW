//write a function that takes in age as input and return if that person is elgible to vote or not .
// a person of age >18 is eligible to vote 
import java.util.Scanner;
public class AgeElgible{

    static int Voteers(int age){
        if(age>18){
            System.out.println("HE OR SHE can elgible for vote !!!");

        }else{
            System.out.println("sorry they are not elgible for vote :");
        }
        return age;
    }
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age to check he or she elgible for vote or not : ");
        int age=sc.nextInt();
        Voteers(age);


    }
}