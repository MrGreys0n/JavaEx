public class LinkedIntList {
    private ListNode front;

    public LinkedIntList() {
        front = null;
    }

    public void add(int value) {

        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }

            current.next = new ListNode(value);
        }
    }

    public int get(int index) {
        ListNode current = goTo(index);
        return current.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void remove(int index) {
        if (index == 0) {
            front = front.next;
        } else {
            ListNode current = goTo(index - 1);
            current.next = current.next.next;
        }
    }

    public int size() {
        int count = 0;
        ListNode current = front;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    private ListNode goTo(int index) {
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    public void removeDuplicates(){
        int i = 0;
        while (i < this.size() - 1){
            ListNode element = goTo(i);
            int j = i + 1;
            while (j < this.size()){
                if (goTo(j).getData() == element.getData()){
                    this.remove(j);
                }
                else j++;
            }
            i++;
        }
    }

    public class ListNode{
        public int data;
        public ListNode next;

        public ListNode(int data) {
            this.data = data;
        }

        public ListNode(int data, ListNode next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }
    }

}
