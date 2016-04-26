import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inputText = console.nextLine();
        String targetWord = console.nextLine();
        int counter = 0;

        Pattern patt = Pattern.compile(targetWord + "\\W", Pattern.CASE_INSENSITIVE);
        Matcher match = patt.matcher(inputText);

        while (match.find()){
            counter++;
        }
        System.out.println(counter);
    }
}
