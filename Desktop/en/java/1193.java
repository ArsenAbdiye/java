import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCount = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= testCount; i++) {
            String[] inputData = scanner.nextLine().split(" ");
            String value = inputData[0], format = inputData[1];
            int decimalValue = 0;

            if (format.equals("bin")) {
                decimalValue = Integer.parseInt(value, 2);
                System.out.println("Case " + i + ":");
                System.out.println(decimalValue + " dec");
                System.out.println(Integer.toHexString(decimalValue) + " hex");
            } else if (format.equals("dec")) {
                decimalValue = Integer.parseInt(value);
                System.out.println("Case " + i + ":");
                System.out.println(Integer.toHexString(decimalValue) + " hex");
                System.out.println(Integer.toBinaryString(decimalValue) + " bin");
            } else if (format.equals("hex")) {
                decimalValue = Integer.parseInt(value, 16);
                System.out.println("Case " + i + ":");
                System.out.println(decimalValue + " dec");
                System.out.println(Integer.toBinaryString(decimalValue) + " bin");
            }

            System.out.println();
        }
        scanner.close();
    }
}
