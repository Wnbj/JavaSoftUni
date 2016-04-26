import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();

        Pattern patt = Pattern.compile("\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}\\b", Pattern.CASE_INSENSITIVE);
        Matcher match = patt.matcher(input);

        while (match.find()){
            System.out.println(match.group());
        }
    }
}
