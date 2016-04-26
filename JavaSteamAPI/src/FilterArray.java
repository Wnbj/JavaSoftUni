import java.util.Arrays;
import java.util.Scanner;

public class FilterArray {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        String[] inputArr = input.split(" ");

        Arrays.stream(inputArr)
                .filter(p -> p.length() > 3)
                .forEach(p -> System.out.print(p + " "));

    }
}
