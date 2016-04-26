import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtracktAllUniqueWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] inputArr = console.nextLine().split(" ");
        TreeSet<String> words = new TreeSet<>();

        for (int i = 0; i < inputArr.length; i++) {
            Pattern patt = Pattern.compile("\\w+");
            Matcher match = patt.matcher(inputArr[i]);

            while (match.find()) {
                words.add(match.group().toLowerCase());
            }
        }
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}

