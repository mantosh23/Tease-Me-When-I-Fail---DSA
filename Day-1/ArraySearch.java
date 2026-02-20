public class ArraySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 45, 4, 6, 2, 10, 21, 42, 12 };
        int ans = linearSearch(arr, 100);
        if (ans == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target is at index " + ans);
        }
    }

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
