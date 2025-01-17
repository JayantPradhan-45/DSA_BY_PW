import java.util.ArrayList;

//import java.util.Collections;

public class ListArray {
    static void ReverseList(ArrayList<Integer> Arr){
        int i=0 ,j=Arr.size()-1;
        while(i<j){
            /*
            int temp=arr(i);
            arr(i)=arr(j);    //swap method
            arr(j)=temp;
             */
            Integer temp=Integer.valueOf(Arr.get(i));
            Arr.set(i,Arr.get(j));
            Arr.set(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> Arr=new ArrayList<>();
        Arr.add(0);
        Arr.add(10);
        Arr.add(3);
        Arr.add(5);
        Arr.add(22);
        Arr.add(10);
        System.out.println("orignal list" + Arr);
//        Collections.reverse(Arr);
        ReverseList(Arr);
        System.out.println("reversed list " + Arr);

    }
}
