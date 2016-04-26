import java.util.Scanner;

public class SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int length = console.nextInt();
        int[] numbers = new int[length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = console.nextInt();
        }
        int temp = 0;
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
