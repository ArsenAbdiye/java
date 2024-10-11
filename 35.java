import java.util.Scanner;

public class Main {
    public static int findInsertPosition(int[] array, int value) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (array[mid] == value) {
                return mid;
            }
            if (array[mid] < value) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCount = sc.nextInt();
        for (int i = 0; i < testCount; i++) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int j = 0; j < size; j++) {
                arr[j] = sc.nextInt();
            }
            int targetValue = sc.nextInt();
            int result = findInsertPosition(arr, targetValue);
            System.out.println("Position: " + result);
        }

        sc.close();
    }
}
