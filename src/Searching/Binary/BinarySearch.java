package Searching.Binary;

public class BinarySearch {
    public static void main(String[] args) {
        // int[] array = { 2, 4, 7, 9, 11, 15, 19, 26, 29, 36, 38, 39, 42, 47, 48 };
        // int[] array = { 48, 42, 36, 19, 11, 9, 4, 1 };
        int[] array = { 3, 3, 3, 3, 4, 6, 7 };
        int target = 7;
        System.out.println(binary(array, target));
    }

    static int binary(int[] arr, int tar) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[end] >= arr[0]) {
                if (tar > arr[mid]) {
                    start = mid + 1;
                } else if (tar < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            } else {
                if (tar > arr[mid]) {
                    end = mid - 1;
                } else if (tar < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
