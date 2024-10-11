public class Solution {
    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        
        if (index == -1) {
            return word;
        }
        
        String reversedPart = new StringBuilder(word.substring(0, index + 1)).reverse().toString();
        String remainingPart = word.substring(index + 1);
        
        return reversedPart + remainingPart;
    }
}
