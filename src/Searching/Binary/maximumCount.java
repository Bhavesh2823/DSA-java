package Searching.Binary;

public class maximumCount {
    public static int maximumcount(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int size = nums.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < 0) {
                start = mid + 1;
            } else if (nums[mid] > 0) {
                end = mid - 1;
            }
        }
        return Math.max(start, size - start);
    }

    public static void main(String[] args) {
        int[] arr = { -9, -7, -4, -2, -1, 0, 0, 2, 5, 7, 9, 11, 19 };
        System.out.println(maximumcount(arr));
    }
}
