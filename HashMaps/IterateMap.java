package HashMaps;

import java.util.HashMap;

public class IterateMap {
    public static void main(String[] args){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("jayant" ,50);
        map.put("ram" , 30);
        map.put("shyam" , 40);
        map.put("krish",12);
        // for print key
        for(String key : map.keySet()){
            System.out.println(key);
        }
        //for print values and  keys
        for(String key : map.keySet()){
            System.out.println(key + " "+map.get(key));
        }
        //if we want to print only values
        for(int val : map.values()){
            System.out.println(val);
        }
        //if we want to print pairs
        for(Object pair :map.entrySet()){
            System.out.println(pair);
        }

    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character ,Integer> smap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char key=s.charAt(i);
            if(smap.containsKey(key)){
                int freq=smap.get(key);
                smap.put(key,freq+1);
            }
            else smap.put(key,1);
        }
        HashMap<Character ,Integer> tmap=new HashMap<>();
        for(int i=0;i<t.length();i++){
            char key=t.charAt(i);
            if(tmap.containsKey(key)){
                int freq=tmap.get(key);
                tmap.put(key,freq+1);
            }
            else tmap.put(key,1);
        }
        for(char key : smap.keySet()){
            int val1=smap.get(key);
            if(!tmap.containsKey(key)) return false;
            int val2=tmap.get(key);
            if(val1 != val2){
                return false ;
            }

        }
        return true;
    }
}