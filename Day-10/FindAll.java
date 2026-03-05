import java.util.ArrayList;

public class FindAll {
    public static void main(String[] args) {
        int[] arr = { 9, 3, 2, 1, 18, 9, 9 };
        System.out.println(findAll(arr, 9, 0));
    }

    static ArrayList<Integer> findAll(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAll(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
