package com.kunal;

import java.util.Scanner;

public class reverse_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no.: ");
        int num = sc.nextInt();
        int result = 0;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            result = result * 10 + rem;
        }
        System.out.println(result);
    }
}
