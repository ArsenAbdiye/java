import java.util.Arrays;

public class methods {
    // 1
    // public static void printGreeting(String name) {
    //     System.out.println("Привет, " + name + "!");
    // }

    // public static void main(String[] args) {
    //     printGreeting("arsen");
    // }

    // 2
    // public static void displayArray(int[] array) {
    //     for (int element : array) {
    //         System.out.println(element);
    //     }
    // }

    // public static void main(String[] args) {
    //     int[] testArray = {1, 2, 3};

    //     displayArray(testArray);
    // }


    // 3
    // public static int findMax(int[] arr) {
    //     int maxNum = arr[0];
    //     for (int num : arr) {
    //         if (num > maxNum) {
    //             maxNum = num;
    //         }
    //     }
    //     return maxNum;
    // }
    // public static void main(String[] args) {
    //     int[] testArray = {4, 1, 7, 2};

    //     System.out.println(findMax(testArray));
    // }

    // 4
    // public static int countVowels(String input) {
    //     int vowels = 0;

    //     for (int i = 0; i < input.length(); i++) {
    //         char ch = input.charAt(i);

    //         if (ch == 'o' || ch == 'i' || ch == 'e' || ch == 'y' || ch == 'a' || ch == 'u') {
    //             vowels++;
    //         }
    //     }

    //     return vowels;
    // }

    // public static void main(String[] args) {
    //     String sentence = "hello world";

    //     System.out.println( countVowels(sentence));
    // }

    // 5
    // public static double calculateAverage(int[] array) {
    //     double num = array[0];

    //     for (int i = 1; i < array.length; i++) {
    //         num += array[i];
    //     }
    //     num /= array.length;

    //     return num;
    // }

    // public static void main(String[] args) {
    //     int[] array = {1, 2, 3, 4, 5};

    //     System.out.println(calculateAverage(array));
    // }

    // 6
    // public static double fahrenheitToCelsius(double fahrenheit) {
    //     double celsius = (fahrenheit - 32) * 5 / 9;
    //     return celsius;
    // }

    // public static void main(String[] args) {
    //     System.out.println(fahrenheitToCelsius(98.6));
    // }

    // 7
    // public static String reverseString(String input) {
    //     StringBuilder reversedString = new StringBuilder(); 
        
    //     for (int i = input.length() - 1; i >= 0; i--) {
    //         reversedString.append(input.charAt(i));
    //     }

    //     return reversedString.toString();
    // }

    // public static void main(String[] args) {
    //     System.out.println(reverseString("lorem"));
    // }

    // 8

    // public static String repeatString(String input, int count) {
    //     String repeatedString = input.repeat(count);

    //     return repeatedString;
    // }

    // public static void main(String[] args) {
    //     System.out.print(repeatString("Java", 3));
    // }

    // 9

    // public static int sumArray(int[] array) {
    //     int res = 0;

    //     for (int i = 0; i < array.length; i++) {
    //         res += array[i];
    //     }

    //     return res;
    // }

    // public static void main(String[] args) {
    //     int[] array = {1, 2, 3, 4};

    //     System.out.print(sumArray(array));
    // }

    // 10
    public static int[] squareArray(int[] array) {
        int[] squaredArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            squaredArray[i] = array[i] * array[i];
        }

        return squaredArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        System.out.print(Arrays.toString(squareArray(array))); 
    }
}
