package Searching.Linear;

public class richestperson {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 5 }, { 7, 3 }, { 3, 5 }
        };
        System.out.println(findrichest(arr));
    }

    static int findrichest(int[][] accounts) {
        int max = accounts[0][0];
        for (int i = 0; i < accounts.length; i++) {
            int rowsum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                rowsum = rowsum + accounts[i][j];
            }
            if (rowsum > max) {
                max = rowsum;
            }
        }
        return max;
    }
}
