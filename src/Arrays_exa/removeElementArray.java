package Arrays_exa;

import java.util.*;

public class removeElementArray {
    public static void removeElement(int[] nums, int val) {
        // int[] newarr = new int[nums.length - 1];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }
            list.add(nums[i]);
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        int[] array = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int num = 2;
        removeElement(array, num);
        // System.out.println(removeElement(array, num));
    }
}
