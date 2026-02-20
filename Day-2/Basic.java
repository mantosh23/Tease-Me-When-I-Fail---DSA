public class Basic {
    public static void main(String[] args) {
        // int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
        char[] arr = { 'c', 'f', 'j' };
        System.out.println(ceiling(arr, 'g'));
    }

    static int ceiling(int[] arr, int target) {

        if (target > arr[arr.length - 1]) {
            return arr.length - 1;
        }

        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }

    static char ceiling(char[] letters, char target) {
        int s = 0;
        int e = letters.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (letters[mid] < target) {
                s = mid + 1;
            } else if (letters[mid] > target) {
                e = mid - 1;
            }
        }
        return letters[s % letters.length];
    }
}
