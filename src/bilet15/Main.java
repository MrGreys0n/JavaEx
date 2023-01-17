package bilet15;

import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(-5);
        stack.push(-10);
        stack.push(15);
        stack.push(22);
        System.out.println(stack);
        Splitter splitter  = new Splitter();
        splitter.splitStack(stack);
        System.out.println(stack);
    }
}
