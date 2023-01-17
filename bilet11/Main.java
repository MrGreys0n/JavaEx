package bilet11;

public class Main {
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();
        for (int i = 0; i < 10; i++){
            list.add(i);
            list.add(i);
        }
        list.removeDuplicates();
        list.firstLast();
        System.out.println(list);
    }
}
