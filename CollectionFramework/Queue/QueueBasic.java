package CollectionFramework.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasic {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);


        System.out.println(q);

        // Insert the specific element into queue Return True if added succesfully and false if not
        //  q.offer(10);
        //  q.offer(20);
        //  q.offer(30);
        //  q.offer(40);
        

         //Remove and return the element at front and return null if queue is empty

        //  System.out.println(q.poll());

        //Retrive but dont remove it from the queue
        // System.out.println(q.element());
        // System.out.println(q.peek());


        // traversal in queue
// while (!q.isEmpty()) {
//     System.out.println(q.poll());
//     System.out.println();
// }

//Remove from the queue
// System.out.println(q.remove());
        System.out.println(q);
    }
}
