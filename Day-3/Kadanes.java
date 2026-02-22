public class Kadanes {
    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(getSubArraySum(arr));
    }

    public static int getSubArraySum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int curr = 0;
        for (int i = 0; i < arr.length; i++) {
            curr += arr[i];
            if (curr < 0) {
                curr = 0;
            }
            max = Math.max(max, curr);
        }
        return max;
    }
}
