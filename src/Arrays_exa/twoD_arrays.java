package Arrays_exa;

import java.util.Arrays;
import java.util.Scanner;

public class twoD_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int r = sc.nextInt();
        // System.out.print("Enter No. of Colums: ");
        // int c = sc.nextInt();

        int[][] arr = new int[r][];

        for (int row = 0; row < arr.length; row++) {
            System.out.print("Enter the number of columns for row " + (row + 1) + ": ");
            int cols = sc.nextInt();

            arr[row] = new int[cols];

            // enter the inputs for current row
            System.out.print("Enter the elements for row " + (row + 1) + ": ");
            System.out.println();
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print("Enter The number: ");
                arr[row][column] = sc.nextInt();
            }
        }

        // for (int row = 0; row < arr.length; row++) {
        // for (int column = 0; column < arr[row].length; column++) {
        // System.out.print("|" + arr[row][column] + "|");
        // }
        // System.out.println();
        // }

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        // modified for loop
        // for (int[] i : arr) {
        // System.out.println(Arrays.toString(i));
        // }

    }
}
