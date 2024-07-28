package Searching.Linear;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Bhavesh";
        char target = 's';
        System.out.println(StringSearch2(name, target));
    }

    // using for loop
    static boolean StringSearch(String str, char tar) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == tar) {
                return true;
            }
        }
        return false;
    }

    // Using for each loop
    static boolean StringSearch2(String str, char tar) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == tar) {
                return true;
            }
        }
        return false;
    }
}
