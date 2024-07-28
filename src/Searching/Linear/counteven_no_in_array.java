package Searching.Linear;

class counteven_no_in_array {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) { // check this condition for if (String.valueOf(num).length() %
                                                         // // 2 == 0) then count++;
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        if (num < 0) {
            num = num * -1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        if (count % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] array = { 12, 345, 2, 6, -7896 };
        System.out.println(findNumbers(array));
    }
}