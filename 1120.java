import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        while (true) {
            char faultyDigit = inputScanner.next().charAt(0);
            String originalNumber = inputScanner.next();

            if (faultyDigit == '0' && originalNumber.equals("0")) {
                break;
            }

            StringBuilder resultNumber = new StringBuilder();
            for (int idx = 0; idx < originalNumber.length(); idx++) {
                if (originalNumber.charAt(idx) != faultyDigit) {
                    resultNumber.append(originalNumber.charAt(idx));
                }
            }

            int nonZeroIndex = 0;
            while (nonZeroIndex < resultNumber.length() && resultNumber.charAt(nonZeroIndex) == '0') {
                nonZeroIndex++;
            }

            if (nonZeroIndex == resultNumber.length()) {
                System.out.println(0);
            } else {
                System.out.println(resultNumber.substring(nonZeroIndex));
            }
        }

        inputScanner.close();
    }
}
