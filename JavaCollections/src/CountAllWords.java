import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountAllWords {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        String pattern = "[A-Za-z]+";
        int counter = 0;

        Pattern patt = Pattern.compile(pattern);
        Matcher match =patt.matcher(input);

        while (match.find()){
            counter++;
        }
        System.out.println(counter);
    }
}
