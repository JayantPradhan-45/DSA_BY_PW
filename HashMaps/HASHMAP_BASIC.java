package HashMaps;
//create hashmap using java hashmap class to store the following pairs (person , age ) and display them

import java.util.*;

public class HASHMAP_BASIC {
    public static void main(String[] args){
        //syntax
        HashMap<String,Integer> map=new HashMap<>();
        //Adding element
        map.put("Akash",18);  //akash is key and 18 is value
        map.put("jayant" , 23);
        map.put("bikash", 24);
        map.put("subham" ,45);
        //getting value of a  key from the hashmap
        System.out.println(map.get("jayant"));
        System.out.println(map.get("tapan"));
        //changing or updating value of a key in hashmap
        map.put("jayant",78);
        System.out.println(map.get("jayant"));
        //now removing a pair from this hashmap
        System.out.println(map.remove("jayant"));
        System.out.println(map.get("jayant"));
        //checking if a key is in the hashmap
        System.out.println(map.containsKey("jayant"));
        System.out.println(map.containsKey("subham"));
        //adding a new entry only if the new key doesn't  exist already
        map.putIfAbsent("krishna",111);
        map.putIfAbsent("bikash",20);
        //get the all the key in the hashmap
        System.out.println(map.keySet());
        //get all value in the hashmap
        System.out.println(map.values());
        //get all entires in the hashmap
        System.out.println(map.entrySet());
        //traversing all entries of hashmap - muiltiple methods
        for(String key : map.keySet()){
            System.out.printf("Age of %s is %d\n",key,map.get(key));
        }





    }
}
