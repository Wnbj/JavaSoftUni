import java.util.ArrayList;
        import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String firstInput = console.nextLine();
        String secondInput = console.nextLine();
        ArrayList<Character> firstList = new ArrayList<>();
        ArrayList<Character> secondList = new ArrayList<>();

        for (int i = 0; i < firstInput.length() ; i++) {
            firstList.add(firstInput.charAt(i));
        }
        for (int i = 0; i < secondInput.length() ; i++) {
            secondList.add(secondInput.charAt(i));
        }
        Pattern patt = Pattern.compile("[^" +  firstInput +"]");
        Matcher match = patt.matcher(secondInput);
        while (match.find()){
            String ch = (match.group());
            for (int i = 0; i < ch.length(); i++) {
                firstList.add(' ');
                firstList.add(ch.charAt(i));
            }
        }
        for (Character character : firstList) {
            System.out.print(character);
        }
    }
}

