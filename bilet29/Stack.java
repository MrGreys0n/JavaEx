package bilet29;

public class Stack<T> {
    public T[] array;
    public int number_of_elements;

    public Stack() {
        number_of_elements = 0;
        this.array = (T[]) new Object[number_of_elements];
    }

    void push(T element) {
        number_of_elements++;
        T[] temp = array;
        array = (T[]) new Object[number_of_elements];
        for (int i = 0; i < number_of_elements - 1; i++) {
            array[i] = temp[i];
        }
        array[number_of_elements - 1] = element;
    }

    T pop() {
        if (number_of_elements == 0) {
            return null;
        }
        T last = array[number_of_elements - 1];
        number_of_elements--;
        T[] temp = array;
        array = (T[]) new Object[number_of_elements];
        for (int i = 0; i < number_of_elements; i++) {
            array[i] = temp[i];
        }
        return last;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < number_of_elements; i++){
            s += array[i] + "  ";
        }
        return s;
    }
}
