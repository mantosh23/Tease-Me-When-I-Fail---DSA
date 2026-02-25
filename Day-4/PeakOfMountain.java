// https://leetcode.com/problems/find-peak-element/submissions/1928391045/
//https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeakOfMountain {
    public static void main(String[] args) {
        int[] arr = { 0, 10, 5, 2 };
        System.out.println(findPeak(arr));
    }

    public static int findPeak(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] < arr[mid + 1]) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return e;
    }
}
