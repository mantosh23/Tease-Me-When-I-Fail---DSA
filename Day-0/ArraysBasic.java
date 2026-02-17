import java.util.Arrays;

public class ArraysBasic {
    public static void main(String[] args) {
        // creation
        int[] arr = new int[4];
        int size = 0;

        // insertion
        arr[0] = 1;
        size++;
        // or
        for (int i = 1; i < 4; i++) {
            arr[i] = i + 1;
            size++;
        }

        // read
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // or
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        // or
        System.out.println(Arrays.toString(arr));

        // delete [1,2,3,4]
        // 1 from first
        // for (int i = 0; i < size - 1; i++) {
        // arr[i] = arr[i + 1];
        // }
        // size--;

        // 2 from last
        // arr[size - 1] = 0;
        // size--;

        // 3 at an index
        // int index = 2;
        // System.out.println(arr[2]);
        // for (int i = index; i < size - 1; i++) {
        // arr[i] = arr[i + 1];
        // }
        // size--;

        // for (int i = 0; i < size; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // insert at index
        // int index = 1;
        // for (int i = size - 1; i >= index; i--) {
        // arr[i] = arr[i - 1];
        // }
        // arr[index] = 3;

        // for (int i = 0; i < size; i++) {
        // System.out.print(arr[i] + " ");
        // }
    }
}
