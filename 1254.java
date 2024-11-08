import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String tag = scanner.next();
            int num = scanner.nextInt();
            scanner.nextLine();
            String inputString = scanner.nextLine();
            processInputString(tag, String.valueOf(num), inputString);
        }

        scanner.close();
    }

    private static void processInputString(String tag, String num, String text) {
        ArrayList<String> arr = new ArrayList<>();
        boolean a = false;
        StringBuilder tagBuilder = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == '<') {
                a = true;
                tagBuilder = new StringBuilder();
            }
            if (a) {
                tagBuilder.append(c);
            }
            if (c == '>') {
                a = false;
                arr.add(tagBuilder.toString());
            }
        }

        for (String tagInArr : arr) {
            text = text.replaceAll("(?i)" + tagInArr, tagInArr.replaceAll("(?i)" + tag, num));
        }

        System.out.println(text);
    }
}
