package ocp.ocp_newBook.chap9;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author $ Devalère
 **/
public class WorkingWithQueueAndDequeMethods {
    public static void main(String[] args){
        //Let’s show a simple queue example:
         Queue<Integer> queue = new LinkedList<>();
         queue.add(10);
         queue.add(4);
         System.out.println(queue.remove()); // 10
         System.out.println(queue.peek()); // 4
    }
}
