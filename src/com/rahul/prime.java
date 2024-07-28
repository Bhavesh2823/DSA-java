package com.rahul;

import java.util.*;

public class prime {
    public static void main(String args[]) {

        @SuppressWarnings("resource")

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your No.: ");
        int num = sc.nextInt();
        int c = 2;

        while (c < Math.sqrt(num)) {
            if (num % c == 0) {
                System.out.println("The number " + num + " is not prime");
                c = c + 1;
                break;
            } else {
                System.out.println("The number " + num + " is prime");
                c = c + 1;
                break;
            }
        }
    }
}