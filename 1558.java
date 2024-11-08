import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int a = (int) Math.sqrt(n);
            int b = 0;
            boolean flag = false;

            while (a >= b) {
                int c = (int) (Math.pow(a, 2) + Math.pow(b, 2));
                if (c == n) {
                    flag = true;
                    break;
                } else if (c < n) {
                    b++;
                } else {
                    a--;
                }
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
