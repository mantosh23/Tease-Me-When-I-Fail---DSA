public class MergeInPlace {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 0, 1 };
        mergeSort(arr, 0, arr.length);
        System.out.println(arr);
    }

    static int[] mergeSort(int[] arr, int start, int end) {
        if (end - start == 1) {
            return arr;
        }
        int mid = start + (end - start) / 2;
        int[] left = mergeSort(arr, start, mid);
        int[] right = mergeSort(arr, mid + 1, end);
        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int[] arr = new int[left.length + right.length];
        int j = 0, i = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            arr[k] = left[i];
            i++;
        }

        while (j < arr.length) {
            arr[k] = right[j];
            j++;
        }
        return arr;
    }
}
