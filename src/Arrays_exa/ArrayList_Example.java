package Arrays_exa;

import java.util.*;
import java.util.ArrayList;

public class ArrayList_Example {
    // Syntax
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(5);

        System.out.print("Enter length of an Array: ");
        int len = sc.nextInt();

        for (int i = 0; i < len; i++) {
            System.out.print("Enter Your No.: ");
            list.add(sc.nextInt());
        }

        // list.set(3, 109);
        // // list.remove(3);
        // list.set(3, 103);
        // list.add(9, 109);
        // list.clone();
        // boolean ans = list.contains(110);
        // System.out.println(ans);

        for (int i = 0; i < len; i++) {
            System.out.print(list.get(i) + " | ");
        }

        System.out.println();
        int ans = list.indexOf(4);
        System.out.println(ans);
        System.out.println(list.size());

    }

}
