package Sorting.CyclicSort;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4 };
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }

    static int[] cyclicSort(int[] arr) {
        int i = 0;
        int[] nums = new int[2];
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
                nums[0] = arr[j];
                nums[1] = j + 1;
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
