package com.kunal;

import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Char: ");
        char ch = sc.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("The Character Is LowerCase");
        } else {
            System.out.println("The Character Is Upper Case");
        }
    }
}
