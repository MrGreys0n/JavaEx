package reverse;

import java.util.Queue;
import java.util.Stack;

public class Reverse {
    public void reverseHalf(Queue<Integer> queue){
        int size = queue.size();
        var stack = new Stack<Integer>();
        int element;
        for (int i = 0; i < size; i++) {
            element = queue.poll();
            if (i % 2 == 0) queue.add(element);
            else stack.add(element);
        }
        for (int i = 0; i < size / 2; i++) {
            element = queue.poll();
            queue.add(element);
            element = stack.pop();
            queue.add(element);
        }
        if(size % 2 == 1) {
            element = queue.poll();
            queue.add(element);
        }
    }
}
