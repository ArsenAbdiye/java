import java.util.Scanner;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(fun(s));
        scanner.close();
    }

    public static boolean fun(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' && (stack.isEmpty() || stack.pop() != '(')) {
                return false;
            } else if (ch == '}' && (stack.isEmpty() || stack.pop() != '{')) {
                return false;
            } else if (ch == ']' && (stack.isEmpty() || stack.pop() != '[')) {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
