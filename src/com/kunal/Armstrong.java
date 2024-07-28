package com.kunal;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your No.: ");
        int No = sc.nextInt();
        boolean ans = armstrong(No);
        System.out.println(ans);

        for (int i = 100; i < 1000; i++) {
            if (armstrong(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean armstrong(int num) {
        int n = num;
        int rem;
        int cube;
        int sum = 0;

        while (n > 0) {
            rem = n % 10;
            cube = rem * rem * rem;
            sum = sum + cube;
            n = n / 10;
            // System.out.println(n);
        }
        // System.out.println(num);

        return sum == num;
    }
}
