package reverse;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.add(1);
        queue.add(8);
        queue.add(7);
        queue.add(2);
        queue.add(9);
        queue.add(18);
        queue.add(12);
        queue.add(0);
        queue.add(9);
        System.out.println(queue);
        var reverse = new Reverse();
        reverse.reverseHalf(queue);
        System.out.println(queue);
    }
}
