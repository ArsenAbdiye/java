import java.util.Scanner;

public class Main {
    
    public static int fun(String a, String b) {
        if (a.length() != b.length()) return 1000;
        int count = 0;
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt(); 
        scanner.nextLine();  
        String s;
        
        while (scanner.hasNextLine()) {
            s = scanner.nextLine();
            if (fun(s, "one") <= 1) {
                System.out.println(1);
            }
            if (fun(s, "two") <= 1) {
                System.out.println(2);
            }
            if (fun(s, "three") <= 1) {
                System.out.println(3);
            }
        }

        scanner.close();  
    }
}
