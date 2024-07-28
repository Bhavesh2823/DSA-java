package Arrays_exa;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of an Array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        // arr[0] = 41;
        // arr[1] = 42; // repeatative process
        // arr[2] = 43;
        // arr[3] = 44;
        // arr[4] = 45;

        // use for loop then
        /*
         * for (int i = 0; i < length; i++) { // you can use arr.length as well in place
         * of legth here
         * System.out.print("Enter Numbers:");
         * arr[i] = sc.nextInt();
         * }
         */

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        // here we can use a enhanced version of an array known as for each loop i.e for
        // each element in an arr print num
        for (int num : arr) {

            System.out.print(num + " "); // here num represents element of an array
        }
        System.out.println();

        System.out.println(Arrays.toString(arr));

        System.out.print("enter the no. of strings: ");
        int len = sc.nextInt();

        String[] str = new String[len];

        for (int i = 0; i < str.length; i++) {
            System.out.print("Enter Your String: ");
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
