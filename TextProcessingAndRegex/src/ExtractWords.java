import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        String pattern = "([a-zA-Z])+";

        Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(input);

        while (match.find()) {
            System.out.print(match.group() + " ");
        }
    }
}
