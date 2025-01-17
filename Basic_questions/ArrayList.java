//all about ArrayList;
import java.util.ArrayList;
public class Array{
    public static void main(String[] args ){
        //create an arraylist;
        //syntax
        ArrayList<Integer> A1=new ArrayList<>();

        // add new element .
        A1.add(4);
        A1.add(3);
        A1.add(7);
        A1.add(0);

        //get an element at index i.
        System.out.println(L1.get(2)); // ans =7.

        // print arraylist with for loop.
        for(int i=0;i<A1.size();i++){
            System.out.println(A1.get(i)); // this line will print all element of array list .

        }
        //adding element at some index i;
        A1.add(1,50);
        A1.add(2,60);
        System.out.println(A1);





    }
}