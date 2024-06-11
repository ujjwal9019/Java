package CollectionFramework.Queue;

import java.util.Deque;
import java.util.ArrayDeque;

public class ArrayDeq {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>(); 
        // This two to add in from rear 
        dq.offer(10);
        dq.offerLast(20);
        //This   to add from first 
        dq.offerFirst(30);
      

        // remove from first
        System.out.println(dq.poll());
 
        //remove from the last
        System.out.println(dq.pollLast());
        System.out.println(dq);
    }
}
