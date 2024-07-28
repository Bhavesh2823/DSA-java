package com.kunal;

import java.util.Arrays;

public class Arr {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 2, 4 };
        change(arr);
        System.out.println(Arrays.toString(arr));

        String name = "Bhavesh";
        changeName(name);
        System.out.println(name);
    }

    static void change(int[] nums) {
        nums[0] = 99;
    }

    static void changeName(String naam) {
        naam = "Rahul";
    }
}
