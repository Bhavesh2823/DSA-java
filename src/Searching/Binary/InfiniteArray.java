package Searching.Binary;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 7, 8, 9, 12, 13, 16, 17, 19, 23, 25, 27, 28, 29, 35, 39, 44, 46 };
        int target = 17;

        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1; // this is going to be the next start

            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
