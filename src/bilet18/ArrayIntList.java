package bilet18;

public class ArrayIntList {
    private int[] elementData;
    private int size;
    public static final int DEFAULT_CAPACITY = 100;
    public ArrayIntList() {
        this(DEFAULT_CAPACITY);
    }
    public ArrayIntList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        elementData = new int[capacity];
        size = 0;
    }
    public void add(int value) {
        add(size, value);
    }
    public void add(int index, int value) {
        checkIndex(index, 0, size);
        if (size >= elementData.length) {
            throw new IllegalStateException("array is full");
        }
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
        elementData[index] = value;
        size++;
    }
    public int get(int index) {
        checkIndex(index);
        return elementData[index];
    }
    public void set(int index, int value) {
        checkIndex(index);
        elementData[index] = value;
    }
    public void remove(int index) {
        checkIndex(index);
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
    }
    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == value) {
                return i;
            }
        }
        return -1;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public String toString() {
        if (size == 0) {
            return "[]";
        } else {
            String result = "[" + elementData[0];
            for (int i = 1; i < size; i++) {
                result += ", " + elementData[i];
            }
            result += "]";
            return result;
        }
    }

    public int longestSortedSequence(){
        int max = 1;
        int counter = 1;
        for (int i = 0; i < this.size - 1; i++) {
            if(elementData[i] <= elementData[i + 1]) counter++;
            else counter = 1;
            max = Math.max(counter, max);
        }
        return max;
    }
    private void checkIndex(int index) {
        checkIndex(index, 0, size - 1);
    }
    private void checkIndex(int index, int low, int high) {
        if (index < low || index > high) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
    }
}
