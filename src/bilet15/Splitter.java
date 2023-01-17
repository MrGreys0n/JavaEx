package bilet15;

import java.util.Stack;

import java.util.Deque;
import java.util.LinkedList;

public class Splitter {
    public void splitStack(Stack<Integer> stack){
        Deque<Integer> deque = new LinkedList<>();
        while (!stack.empty()){
            Integer element = stack.pop();
            if (element < 0) deque.addLast(element);
            else deque.addFirst(element);
        }
        while (deque.size() != 0){
            Integer element = deque.pollLast();
            stack.push(element);
        }
    }
}
