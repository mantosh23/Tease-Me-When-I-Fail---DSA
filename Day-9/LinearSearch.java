import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 9, 3, 2, 1, 18, 9, 9 };
        System.out.println(search(arr, 0, 19));
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(searchAll(arr, 0, 0, list));
    }

    static int search(int[] arr, int index, int target) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return search(arr, index + 1, target);
    }

    static ArrayList searchAll(int[] arr, int index, int target, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return searchAll(arr, index + 1, target, list);
    }
}
