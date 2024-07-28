package com.kunal;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first No.: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second No.: ");
        int num2 = sc.nextInt();

        int ans = sum(num1, num2);
        System.out.println(ans);
    }

    static int sum(int n1, int n2) {
        int result = n1 + n2;
        return result;

    }
}
