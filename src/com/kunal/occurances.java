package com.kunal;

import java.util.Scanner;

public class occurances {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The No.: ");
        int num = sc.nextInt();

        System.out.print("Enter the no. for Occurance: ");
        int ono = sc.nextInt();

        int count = 0;

        // int length = (int) (Math.log10(num) + 1);
        // // System.out.println(length);

        // for(int i=1; i<=length;i++){
        // if()
        // }

        while (num > 0) {
            int rem = num % 10;

            if (rem == ono) {
                count++;
            }
            num = num / 10;
        }
        System.out.println(count);
    }
}
