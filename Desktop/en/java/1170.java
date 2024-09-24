import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        for (int i = 0; i < N; i++) {
            double foodSupply = scanner.nextDouble();
            int days = 0;
            
            while (foodSupply > 1.0) {
                foodSupply /= 2;
                days++;
            }
            
            System.out.println(days + " dias");
        }

        scanner.close();
    }
}
