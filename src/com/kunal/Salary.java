package com.kunal;

import java.util.*;

public class Salary {
    public static void main(String args[]) {

        @SuppressWarnings("resource")

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Salary Here: ");
        int salary = sc.nextInt();
        int bonus = 0;

        if (salary > 10000) {
            bonus = 2000;
        } else {
            bonus = 1000;
        }

        salary = salary + bonus;
        System.out.println("Salary is : " + salary);

        // Type Casting
        int a = (int) (23.767);
        System.out.print("Enter Float Number for Type Tyoe Casting : " + a);

    }
}
