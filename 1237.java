import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNextLine()) {
            String firstString = input.nextLine();
            String secondString = input.nextLine();

            int result = getLongestCommonSubstring(firstString, secondString);
            System.out.println(result);
        }

        input.close();
    }

    public static int getLongestCommonSubstring(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        int[][] dpTable = new int[n1 + 1][n2 + 1];
        int maxLen = 0;

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dpTable[i][j] = dpTable[i - 1][j - 1] + 1;
                    maxLen = Math.max(maxLen, dpTable[i][j]);
                } else {
                    dpTable[i][j] = 0;
                }
            }
        }

        return maxLen;
    }
}
