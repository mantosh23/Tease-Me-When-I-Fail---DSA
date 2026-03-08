import java.util.Arrays;

public class q2 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };

        // rotate(nums, 3);
        move(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    // static void rotate(int[] nums, int k) {
    // int start = 0;
    // int end = nums.length - 1;
    // int i = 0;
    // while (i < k) {
    // int temp = nums[end];
    // System.out.println("end " + nums[end]);
    // move(nums, 0, end);
    // nums[0] = temp;
    // System.out.println(Arrays.toString(nums));
    // i++;
    // }
    // }

    static void move(int[] nums, int k) {
        int start = 0;
        int end = nums.length - 1;
        reverse(nums, start, end);
        reverse(nums, start, k - 1);
        reverse(nums, k, end);
    }

    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
