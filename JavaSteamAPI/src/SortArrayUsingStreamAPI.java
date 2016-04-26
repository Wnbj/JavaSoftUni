import java.util.Arrays;
import java.util.Scanner;

public class SortArrayUsingStreamAPI {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] numbers = console.nextLine().split(" ");
        String order = console.nextLine();

        if (order.equals("Ascending")){
            Arrays.stream(numbers)
                    .map(num -> Integer.parseInt(num))
                    .sorted((num1, num2) -> num1.compareTo(num2))
                    .forEach(num -> System.out.print(num + " "));
        }else{
            Arrays.stream(numbers)
                    .map(num -> Integer.parseInt(num))
                    .sorted((num1, num2) -> num2.compareTo(num1))
                    .forEach(num-> System.out.print(num + " "));
        }
    }
}
