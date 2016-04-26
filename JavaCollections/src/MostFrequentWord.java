import java.util.*;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class MostFrequentWord {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] inputArr = console.nextLine().split(" ");
        TreeMap<String, Integer> occurrences = new TreeMap<>();

        for (int i = 0; i < inputArr.length; i++) {
            Pattern patt = Pattern.compile("\\w+");
            Matcher match = patt.matcher(inputArr[i]);

            while (match.find()) {
                inputArr[i] = (match.group().toLowerCase());
            }
        }
        for (String word : inputArr) {
            Integer oldCount = occurrences.get(word);
            if (oldCount == null) {
                oldCount = 0;
            }
            occurrences.put(word, oldCount + 1);
        }
        int maxCount = Collections.max(occurrences.values());
        for (Map.Entry<String, Integer> mEntry : occurrences.entrySet()) {
            if (mEntry.getValue() == maxCount) {
                System.out.printf("%s -> %d times\n", mEntry.getKey(), mEntry.getValue());
            }
        }
    }
}