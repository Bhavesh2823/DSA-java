package Arrays_exa;

import java.util.Arrays;

public class ArrDemo {
    public static void main(String[] args) {
        // declaration syntax of an array
        // datatype[] Array_name = new datatype[size];
        // lets take an example of storing 5 no. in an array

        int[] arr1 = new int[5];
        // initialization sysntax
        // datatype[] Array_name = {element1, element2,.........,elementn}
        int[] arr2 = { 6, 3, 8, 9, 1 };
        System.err.println(Arrays.toString(arr2));
    }
}
