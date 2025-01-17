//write a program to sort an ArrayList of sorting in decending order .
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> Arr=new ArrayList<>();
        Arr.add("jayant ");
        Arr.add("anirud ");
        Arr.add("chandan ");
        Arr.add("shail");
        Arr.add("salty");
        Arr.add("raja ram ");
        System.out.println("orginal string" + Arr);
        Collections.sort(Arr); // ascending order
        Collections.sort(Arr,Collections.reverseOrder());// after doing ascending order againgive us decending order.

        System.out.println("sorted string " + Arr);

    }
}
