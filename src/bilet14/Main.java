package bilet14;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(5);
        stack1.push(4);
        stack1.push(7);
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(1);
        stack2.push(5);
        stack2.push(4);
        stack2.push(7);
        stack2.push(4);
        Equaler equaler = new Equaler();
        System.out.println(equaler.equals(stack1, stack2));
    }
}
