package HashMaps;
import java.util.HashSet;
public class SetIttrative {
    public static void main(String[] args){
        HashSet<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(70);
//        for(int ele : set){
//            System.out.print(ele +" ");
//        }
//        System.out.println();
        set.clear();
        for(int ele : set){
            System.out.print(ele + " ");
        }
        System.out.println();

    }
}
