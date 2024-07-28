package Searching.Linear;

import java.util.Arrays;

public class searchIn2Darray {
    public static void main(String[] args) {
        int[][] array = {
                { 28, 22, 11, 45, 10 },
                { 24, 12, 3 },
                { 56, 1, 67, 99 },
                { 89, 5 }
        };

        int target = 1;
        System.out.println(Arrays.toString(search(array, target)));
        System.out.println(max(array));
        System.out.println(min(array));
    }

    static int[] search(int[][] arr, int tar) {
        // int[] res = { -1, -1 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == tar) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    static int max(int[][] arr) {
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

    static int min(int[][] arr) {
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
}
