import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String word = scanner.nextLine();
            StringBuilder resp = new StringBuilder();
            boolean flag = false;

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                
                if (Character.isDigit(ch)) {
                    resp.append(ch);
                } else if (ch == 'l') {
                    resp.append('1');
                } else if (ch == 'o' || ch == 'O') {
                    resp.append('0');
                } else if (ch != ' ' && ch != ',') {
                    flag = true;
                    break;
                }
            }

            if (flag || resp.length() == 0) {
                System.out.println("error");
            } else {
                try {
                    long num = Long.parseLong(resp.toString());
                    if (num > 2147483647L) {
                        System.out.println("error");
                    } else {
                        System.out.println(num);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("error");
                }
            }
        }

        scanner.close();
    }
}
