package bilet14;

import java.util.Stack;

public class Equaler {
    public boolean equals(Stack<Integer> stack1, Stack<Integer> stack2){
        Stack<Integer> stack = new Stack<>();
        boolean flag = true;
        if (stack1.size() != stack2.size()) return false;
        while (!stack1.isEmpty()){
            Integer a = stack1.pop();
            Integer b = stack2.pop();
            if (a != b) flag = false;
            stack.push(a);
        }
        while (!stack.isEmpty()){
            Integer element = stack.pop();
            stack1.push(element);
            stack2.push(element);
        }
        return flag;
    }
}
