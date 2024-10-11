import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PhraseChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();  x

        while (n-- > 0) {
            String s = scanner.nextLine();
            Set<Character> uniqueLetters = new HashSet<>();

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (Character.isLowerCase(ch)) {
                    uniqueLetters.add(ch);
                }
            }

            if (uniqueLetters.size() == 26) {
                System.out.println("frase completa");
            } else if (uniqueLetters.size() >= 13) {
                System.out.println("frase quase completa");
            } else {
                System.out.println("frase mal elaborada");
            }
        }

        scanner.close();
    }
}
