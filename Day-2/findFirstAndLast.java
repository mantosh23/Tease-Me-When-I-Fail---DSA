import java.util.Arrays;

public class findFirstAndLast {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 8, 8, 10 };
        int[] ans = searchRange(arr, 7);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = search(arr, target, true);
        ans[1] = search(arr, target, false);
        return ans;
    }

    static int search(int[] arr, int target, boolean first) {
        int ans = -1;
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] < target) {
                s = mid + 1;
            } else if (arr[mid] > target) {
                e = mid - 1;
            } else {
                ans = mid;
                if (first) {
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
        }
        return ans;
    }

}
