import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CardsFrequencies {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] inputArr = console.nextLine().split(" ");
        String matchedCards = null;
        String[] cardsValue = new String[inputArr.length];
        LinkedHashMap<String, Double> cardMap = new LinkedHashMap<>();
        int counter = 0;
        for (int i = 0; i < inputArr.length; i++) {
            Pattern patt = Pattern.compile("\\w+");
            Matcher match = patt.matcher(inputArr[i]);

            while (match.find()) {
                matchedCards = (match.group() + " ");
                cardsValue[i] = matchedCards;
            }
        }
        for (int i = 0; i < cardsValue.length; i++) {
            for (int j = 0; j < cardsValue.length; j++) {
                if (cardsValue[i].equals(cardsValue[j])) {
                    counter++;

                }

            }
            cardMap.put(cardsValue[i], (counter * 100.0) / cardsValue.length);
            counter=0;
        }
        for (Map.Entry keyValuePair : cardMap.entrySet()){
            System.out.printf("%s -> %.2f%%\n", keyValuePair.getKey(), (keyValuePair.getValue()));
        }
    }
}