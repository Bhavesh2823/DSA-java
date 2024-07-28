package com.kunal;

public class Scopping {
    public static void main(String[] args) {
        int a = 10;
        {
            a = 90;
            int c = 30;
            System.out.println(a + " " + c);
        }

        int c = 40;

        System.out.println(a + " " + c);
    }
}
