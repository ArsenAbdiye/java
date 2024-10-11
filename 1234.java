import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String in = sc.nextLine();
            StringBuilder out = new StringBuilder();
            boolean cap = true;

            for (char c : in.toCharArray()) {
                if (Character.isLetter(c)) {
                    if (cap) {
                        out.append(Character.toUpperCase(c));
                    } else {
                        out.append(Character.toLowerCase(c));
                    }
                    cap = !cap;
                } else {
                    out.append(c);
                }
            }

            System.out.println(out.toString());
        }

        sc.close();
    }
}
