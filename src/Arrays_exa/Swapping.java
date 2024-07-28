package Arrays_exa;

import java.util.*;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length of an Array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int maxRange = maximumRange(arr, 2, 6);
        // int max = maximum(arr);
        // System.out.println(max);
        System.out.println(maxRange);

        System.out.print("Enter The indices to swap: ");
        int id1 = sc.nextInt();
        int id2 = sc.nextInt();

        System.out.println(Arrays.toString(arr));
        swap(arr, id1, id2);
        System.out.print(Arrays.toString(arr));
    }

    static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    static int maximum(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    static int maximumRange(int[] array, int start, int end) {
        int max = array[start];
        for (int i = start; i <= end; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}
