package Arrays_exa;

import java.util.Arrays;
import java.util.Scanner;

public class ArrUsingFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int len = sc.nextInt();

        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the Numbers: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.print("Enter the position: ");
        int position = sc.nextInt();

        System.out.print("Enter The number to append: ");
        int number = sc.nextInt();

        int[] ans = change(arr, position - 1, number);
        System.out.println(Arrays.toString(ans));
    }

    static int[] change(int[] array, int pos, int num) {
        array[pos] = num;
        return array;
    }
}
