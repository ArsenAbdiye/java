import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numLines = scanner.nextInt();
        scanner.nextLine(); 

        for (int lineIndex = 0; lineIndex < numLines; lineIndex++) {
            String text = scanner.nextLine();

            StringBuilder encoded = new StringBuilder();
            for (char ch : text.toCharArray()) {
                if (Character.isLetter(ch)) {
                    ch += 3;
                }
                encoded.append(ch);
            }

            encoded.reverse();

            int midPoint = encoded.length() / 2;
            for (int j = midPoint; j < encoded.length(); j++) {
                encoded.setCharAt(j, (char)(encoded.charAt(j) - 1));
            }

            System.out.println(encoded.toString());
        }
        scanner.close();
    }
}
