public class Main {
    public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isUpperCase(ch)) {
                char encryptedChar = (char)(((ch - 'A' + shift) % 26) + 'A');
                result.append(encryptedChar);
            } 
            else if (Character.isLowerCase(ch)) {
                char encryptedChar = (char)(((ch - 'a' + shift) % 26) + 'a');
                result.append(encryptedChar);
            } 
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(encrypt("ZUVIUJKX", -6));
    }
}
