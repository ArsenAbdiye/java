
public class Main {
    public static void main(String[] args) {
        String text = "In this problem we are interested in the frequency of letters in a given line of text.";
        int[] alf = new int[26]; 
        
     
        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            
  
            if (Character.isLetter(letter)) {
                letter = Character.toUpperCase(letter);  
                int index = letter - 'A';  
                alf[index]++;  
            }
        }

        int maxCount = 0;  
        int maxIndex = 0;  

        for (int i = 0; i < alf.length; i++) {
            if (alf[i] > maxCount) {
                maxCount = alf[i];
                maxIndex = i;
            }
        }

        System.out.println((char) (maxIndex + 'A'));
    }
}
