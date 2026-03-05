import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 5, 1 };
        sort(arr, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int index, int turn) {
        if (turn < arr.length - 1) {
            sort(arr, index, turn + 1);
        }
        if (index == arr.length - 1) {
            return;
        }
        if (arr[index] <= arr[index + 1]) {
            int temp = arr[index];
            arr[index] = arr[index + 1];
            arr[index + 1] = temp;
        }
        sort(arr, index + 1, turn);
    }
}
