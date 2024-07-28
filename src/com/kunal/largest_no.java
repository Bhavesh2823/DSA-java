package com.kunal;

import java.util.Scanner;

public class largest_no {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Eneter First No.: ");
        int a = input.nextInt();
        System.out.print("Eneter Second No.: ");
        int b = input.nextInt();
        System.out.print("Eneter Third No.: ");
        int c = input.nextInt();

        /* First Aproach */
        // if (a >= b & a >= c) {
        // System.out.println(a + " Is the largest Value");
        // } else if (b >= a & b >= c) {
        // System.out.println(b + " Is the largest Value");
        // } else {
        // System.out.println(c + " Is the largest Value");
        // }

        /* Second Aproach */
        // int max = a;

        // if (b > max) {
        // max = b;
        // }
        // if (c > max) {
        // max = c;
        // }

        // System.out.println(max);

        /* Third Aproach */
        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);

    }
}
