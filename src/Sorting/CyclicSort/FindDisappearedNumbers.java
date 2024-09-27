package Sorting.CyclicSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.kunal.swap;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> nums = cyclicSort(arr);
        System.out.println(nums);
    }

    public static List<Integer> cyclicSort(int[] arr) {
        List<Integer> nums = new ArrayList<Integer>();

        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                nums.add(j + 1);
            }
        }

        return nums;
    }

    static void swap(int[] arr, int a, int b) {
        arr[a] = arr[a] + arr[b];
        arr[b] = arr[a] - arr[b];
        arr[a] = arr[a] - arr[b];
    }
}
