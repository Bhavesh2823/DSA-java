package com.kunal;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First No.: ");
        int a = sc.nextInt();

        System.out.print("Enter Second No.: ");
        int b = sc.nextInt();

        swapping(a, b);

    }

    static void swapping(int x, int y) {
        int temp = x;
        x = y;
        y = temp;

        System.out.println(x + " " + y);
    }
}
