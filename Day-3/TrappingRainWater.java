import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedRainWater(arr));
    }

    static int trappedRainWater(int[] arr) {
        int n = arr.length;

        int[] left = new int[n];
        left[0] = arr[0];

        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }
        System.out.println(Arrays.toString(left));

        int[] right = new int[n];
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }

        System.out.println(Arrays.toString(right));

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int wl = Math.min(right[i], left[i]);
            trappedWater += (wl - arr[i]);
        }

        return trappedWater;
    }
}
