public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(searchInArray(arr, 0, 0, arr.length - 1));
        // System.out.println(search(arr, 10));
    }

    static int searchInArray(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (arr[start] <= arr[mid]) {
            if (arr[start] <= target && target <= arr[end]) {
                return searchInArray(arr, target, start, mid - 1);
            }
            return searchInArray(arr, target, mid + 1, end);
        } else {
            if (arr[mid] <= target && target <= arr[end]) {
                return searchInArray(arr, target, mid + 1, end);
            }
            return searchInArray(arr, target, start, mid - 1);
        }
    }

    // static int search(int[] arr, int target) {
    // int s = 0;
    // int e = arr.length - 1;
    // while (s <= e) {
    // int mid = s + (e - s) / 2;
    // if (arr[mid] == target) {
    // return mid;
    // }
    // if (arr[s] <= arr[mid]) {
    // if (arr[s] <= target && target <= arr[mid]) {
    // e = mid - 1;
    // } else {
    // s = mid + 1;
    // }
    // } else {
    // if (arr[mid] <= target && target <= arr[e]) {
    // s = mid + 1;
    // } else {
    // e = mid - 1;
    // }
    // }
    // }
    // return -1;
    // }
}
