package Searching.Binary;

import java.util.*;

public class startibgAndEndingOfRange {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 7, 7, 7, 7, 7, 8, 8, 9, 10 };
        int target = 7;

        System.out.println(Arrays.toString(searchRange(arr, target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };

        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    static int search(int[] nums, int target, boolean isStartingRange) {
        int ans = -1;

        int start = 0;
        int end = nums.length - 1;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                // potential ans
                ans = mid;

                if (isStartingRange) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
