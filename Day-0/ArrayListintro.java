import java.util.ArrayList;
import java.util.Collections;

public class ArrayListintro {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        // add
        arr.add(3);
        arr.add(4);
        arr.add(5);

        // get
        System.out.println(arr.get(0));

        System.out.println(arr.size());

        System.out.println(arr);

        // insertat any place
        arr.add(2, 10);
        System.out.println(arr);

        // set
        arr.set(0, 5);
        System.out.println(arr);

        // delete element
        arr.remove(1);
        System.out.println(arr);

        // sorting
        Collections.sort(arr);
        System.out.println(arr);

        System.out.println(arr.isEmpty());
        System.out.println(arr);
    }
}
