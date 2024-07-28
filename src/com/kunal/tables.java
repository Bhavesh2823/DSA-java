package com.kunal;

import java.util.Scanner;

public class tables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your No.: ");
        int num = input.nextInt();

        // for (int i = 1; i <= 10; i++) {
        // System.out.println(i * num);
        // }

        int i = 1;

        while (i <= 10) {
            System.out.println(i * num);
            i++;
        }

    }
}
