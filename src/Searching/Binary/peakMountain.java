package Searching.Binary;

public class peakMountain {
    public static void main(String[] args) {
        int[] arr = { 0, 3, 5, 7, 9, 8, 6, 4, 2, 1 };
        System.out.println(binarySearch(arr));
    }

    static int binarySearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start < end) {
            mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // we are in descending part of an array
                end = mid;
            } else {
                // we are in ascending part of an array
                start = mid + 1;
            }
        }
        return start;
    }
}
