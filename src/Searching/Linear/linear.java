package Searching.Linear;

import java.util.*;

public class linear {
    public static void main(String[] args) {
        int[] array = { 2, 5, 1, 7, -8, 3, 9 };
        int tar = 7;
        int result = searchInRange(array, tar, 2, 5);
        System.out.println(result);
    }

    static int search(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int searchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}