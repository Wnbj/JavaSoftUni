import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartEndWithCapitalLetter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        String[] arrString = input.split("\\s");



        for (int i = 0; i < arrString.length; i++) {
            Pattern patt = Pattern.compile("\\b[A-Z]+[A-Za-z]*[A-Z]+\\b");
            Matcher match = patt.matcher(arrString[i]);

            if (match.find() == true){
                System.out.print(arrString[i] + " ");
            }
        }
    }
}
