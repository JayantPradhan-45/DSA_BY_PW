package HashMaps;

import java.util.HashMap;

public class BasicMaps {
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("jayant" ,50);
        map.put("ram" , 30);
        map.put("shyam" , 40);
        map.put("krish",12);
        System.out.println();
        System.out.println(map);
        map.put("jayant", 100);
        System.out.println(map);
        map.put("hari",40);
        System.out.println(map);
        // in a hashmap, there can be 2 or more key with same value,but keys are unique
        System.out.println(map.containsKey("hari"));
        System.out.println(map.size());
        System.out.println(map.containsValue(78));
        System.out.println(map.containsValue(12));
        System.out.println(map.containsKey("hari"));
        map.remove("jayant");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get("hari"));
    }
}
