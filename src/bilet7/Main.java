package bilet7;

public class Main {
    public static void main(String[] args) {
        LinkedIntList list1 = new LinkedIntList();
        for (int i = 0; i < 10; i++){
            list1.add(i);
            list1.add(i);
        }
        System.out.println(list1);
        LinkedIntList list2 = new LinkedIntList();
        for (int i = 3; i < 57; i++){
            list2.add(i);
            list2.add(i);
        }
        list1.removeAll(list2);
        System.out.println(list1);
    }
}
