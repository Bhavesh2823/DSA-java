package com.kunal;

import java.util.Scanner;

public class Switch_cases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fruit: ");
        String fruit = sc.next();

        switch (fruit) {
            case "Mango":
                System.out.println(fruit + " is a King of all Fruits");
                break;
            case "Apple":
                System.out.println(fruit + " is a sweet red fruit");
                break;

            case "Banana":
                System.out.println(fruit + " is a long yellow fruit");
                break;

            case "Grapes":
                System.out.println(fruit + " is a small green fruit");
                break;

            default:
                System.out.println("!!!  Please Enter Invalid Input   !!!");
        }
        System.out.println("========Thanks For Visiting=======");
    }
}
