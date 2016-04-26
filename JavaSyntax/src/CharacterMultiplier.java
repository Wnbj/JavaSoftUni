import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String firstWord = console.next();
        String secondWord = console.next();
        int result = sumOfChars(firstWord, secondWord);

        System.out.println(result);
    }

    public static int sumOfChars(String firstWord, String secondWord) {
        int sum = 0;
        int multiplied = 0;

        if (firstWord.length() > secondWord.length()) {
            for (int i = 0; i < secondWord.length(); i++) {
                multiplied = firstWord.charAt(i) * secondWord.charAt(i);
                sum += multiplied;
            }
            for (int i = secondWord.length(); i < firstWord.length(); i++) {
                sum += firstWord.charAt(i);
            }
        } else if (firstWord.length() < secondWord.length()) {
            for (int i = 0; i < firstWord.length(); i++) {
                multiplied = firstWord.charAt(i) * secondWord.charAt(i);
                sum += multiplied;
            }
            for (int i = firstWord.length(); i < secondWord.length(); i++) {
                sum += secondWord.charAt(i);
            }
        } else {
            for (int i = 0; i < secondWord.length(); i++) {
                multiplied = firstWord.charAt(i) * secondWord.charAt(i);
                sum += multiplied;
            }
        }
        return sum;
    }
}
