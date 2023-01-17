import java.util.Iterator;

class Stack<T> implements Iterable<T> {
    private static class Node<T> {
        public T data;
        public Node<T> previous;
        public Node<T> next;
    }

    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean empty() {
        return size == 0;
    }

    public void push(T element) {
        if (head == null) {
            head = tail = new Node<>();
        } else {
            var oldTail = tail;
            tail = tail.next = new Node<>();
            tail.previous = oldTail;
        }

        tail.data = element;
        size++;
    }

    public T peek() throws IllegalStateException {
        if (empty()) {
            throw new IllegalStateException("stack is empty");
        }

        return tail.data;
    }

    public T peek(T valueIfEmpty) {
        return empty()
            ? valueIfEmpty
            : tail.data;
    }

    public void pop() throws IllegalStateException {
        if (empty()) {
            throw new IllegalStateException("stack is empty");
        }

        if (--size == 0) {
            head = tail = null;
            return;
        }

        tail = tail.previous;
        tail.next = null;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                var currentData = current.data;
                current = current.next;
                return currentData;
            }
        };
    }
}

class Ticket25 {
    public static void main(String[] args) {
        var stack = new Stack<Integer>();

        stack.push(1);
        stack.push(2);
        stack.push(101);
        stack.pop();
        stack.push(3);
        stack.push(4);

        stack.forEach(System.out::println);

        System.out.println("peek: " + stack.peek());
    }
}
