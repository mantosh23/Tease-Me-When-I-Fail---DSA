public class BinarySearch {
    public static void main(String[] args) {
        // int[] arr = { 1, 4, 5, 10, 21, 23, 30, 43, 50 };
        int[] arr2 = { 50, 43, 31, 23, 21, 18, 12, 9, 4, 2, 1 };
        int ans = binarySearch(arr2, 1);
        if (ans == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target is at index " + ans);
        }
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] <= arr[end]) {
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        } else {
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
