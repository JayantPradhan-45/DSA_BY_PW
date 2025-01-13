package HashMaps;

import java.util.*;

//given an array , find the most frequent element in it, if there are multiple  element
//that appear a minimum of times,print one of them
public class Question01 {
    public static void main(String[] args){
        int[] arr={1,2,1,4,3,1,4,5,4,4,6,3,4,4};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele : arr){
            if(!map.containsKey(ele)){
                map.put(ele,1);
            }
            else{
                map.put(ele,map.get(ele) +1);
            }
        }
        System.out.println("frequency map ");
        System.out.println(map.entrySet());
        int maxfreq=0 ,anskey=-1;
//        for(var e : map.entrySet()){
//            if(e.getValue() > maxfreq){
//                maxfreq=e.getValue();
//                anskey=e.getKey();
//            }
//        }
        //another method for traversing
        for(var key : map.keySet()){
            if(map.get(key) > maxfreq){
                maxfreq=map.get(key);
                anskey=key;
            }

        }
        System.out.println(anskey);

    }
}
