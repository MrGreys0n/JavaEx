package bilet16;

import java.util.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class Copywriter {
    public Stack<Integer> copyStack(Stack<Integer> stack){
        Stack<Integer> new_stack = new Stack<>();
        Queue<Integer> queue = new LinkedList();
        while (!stack.isEmpty()) new_stack.add(stack.pop());
        while (!new_stack.isEmpty()) queue.add(new_stack.pop());
        while (!queue.isEmpty()){
            Integer element =  queue.poll();
            stack.add(element);
            new_stack.add(element);
        }
        return new_stack;
    }
}
