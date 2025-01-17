//return all indeces of array list if x exist in the array
import java.util.ArrayList;
import java.util.Scanner;
public class FindAllIndex {
    static ArrayList<Integer> allIndices(int[] arr, int traget, int idx) {
        //base case
        if (idx >= arr.length) {
            return new ArrayList<Integer>(); //this is for empty array list

        }
        //make a new array list
        ArrayList<Integer> ans = new ArrayList<>();
        //self work
        if (arr[idx] == traget) {
            ans.add(idx);
        }
        //recursive work
        ArrayList<Integer> smallanswer = allIndices(arr, traget, idx + 1);
        ans.addAll(smallanswer);
        return ans;
    }

    public static void main(String[] args){
        int[] arr={7,3,4,5,6,7,7,7};
        int traget=7;
        ArrayList<Integer> ans=allIndices(arr,traget,0);
        for(Integer i:ans){
            System.out.println(i);
        }

    }
}
