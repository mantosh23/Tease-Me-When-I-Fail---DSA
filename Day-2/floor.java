public class floor {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
        System.out.println(arr[findFloor(arr, 8)]);
    }

    public static int findFloor(int[] arr, int target) {

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
        return end;
    }

}
