package bilet29;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        stack.push("hh");
        stack.push("pp");
        stack.push("balls");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}