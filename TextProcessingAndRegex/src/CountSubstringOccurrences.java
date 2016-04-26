import java.util.Scanner;

public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine().toLowerCase();
        String target = console.nextLine();
        int counter = 0;

        for (int i = 0; i <= input.length() - target.length() ; i++) {
            if (target.equals(input.substring(i, target.length() + i))){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
