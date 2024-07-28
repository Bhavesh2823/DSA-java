package com.kunal;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        System.out.println("===== WELCOME =====");

        while (true) {
            System.out.print("Enter the Operation: ");
            char op = sc.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.print("Enter Your First No.: ");
                int num1 = sc.nextInt();

                System.out.print("Enter Your Second No.: ");
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 > 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {

                System.out.println("!! Thank You !!");
                break;
            } else {
                System.out.println("Invalid Operation");
            }
            System.out.println("The answer is: " + ans);
        }

    }
}
