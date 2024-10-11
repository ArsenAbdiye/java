import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            
            if (A == 0 && B == 0) break;
            
            int[] digitCount = new int[10];
            for (int i = A; i <= B; i++) {
                String numberStr = String.valueOf(i);
                for (int j = 0; j < numberStr.length(); j++) {
                    int digit = Character.getNumericValue(numberStr.charAt(j)); 
                    digitCount[digit]++; 
                }
            }
            
           
            for (int i = 0; i < 10; i++) {
                System.out.print(digitCount[i] + (i < 9 ? " " : "\n"));
                break;
            }

        }
        
        scanner.close();
    }
}
