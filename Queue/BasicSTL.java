package Queue;

import java.util.*;

public class BasicSTL {
    public static void main(String[] args) {
        Queue<Integer> q= new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q);
        q.poll();
        q.poll();
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.peek());

    }
}
