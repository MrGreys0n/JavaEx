package bilet16;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 20; i++) {
            stack.push(i);
        }
        Copywriter copywriter = new Copywriter();
        Stack<Integer> new_stack = copywriter.copyStack(stack);
        System.out.println(stack);
        System.out.println(new_stack);
    }
}
