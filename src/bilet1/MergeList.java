package bilet1;

import java.util.ArrayList;

public class MergeList<T> {
    public ArrayList<T> alternate(ArrayList<T> array1, ArrayList<T> array2){
        ArrayList<T> array = new ArrayList<>();
        int size = Math.min(array1.size(), array2.size());
        for (int i = 0; i < size; i++) {
            array.add(array1.get(i));
            array.add(array2.get(i));
        }
        if (array1.size() == size) array1 = array2;
        for (int i = size; i < array1.size(); i++) {
            array.add(array1.get(i));
        }
        return array;
    }


}
