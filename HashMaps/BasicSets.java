package HashMaps;

import java.util.HashSet;

public class BasicSets {
    public static void main(String[] args){
        HashSet<Integer> set=new HashSet<>();
        //insert -- TC- O(1)
        set.add(20);
        set.add(200);
        set.add(300);
        set.add(30);
        System.out.println(set);  // tc - O(n)
        //search available or not ( t/f)
        System.out.println(set.contains(20)); // Tc - O(1) best time complexity
        System.out.println("size is " + set.size());
        set.remove(20); // TC - o(n)
        System.out.println(set);
        //convert set to array
        Object[] arr=set.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
