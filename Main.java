public class Main {
    public static void main(String[] args) {
        LinkedIntList list = new LinkedIntList();
        list.add(9);
        for (int i = 0; i < 10; i++){
            list.add(i);
            list.add(i);
        }
        System.out.println(list);
        list.removeDuplicates();
        System.out.println(list);
    }
}