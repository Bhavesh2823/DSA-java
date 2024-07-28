package com.kunal;

import java.util.Scanner;

public class Fibbonacchi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n) {
            int temp = a + b;
            a = b;
            b = temp;
            count++;
        }
        System.out.println(b);
    }
}
