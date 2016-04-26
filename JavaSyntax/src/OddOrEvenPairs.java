import java.util.Scanner;

public class OddOrEvenPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        String[] arrString = input.split(" ");
        int[] numbers = new int[arrString.length];

        for (int i = 0; i < numbers.length; i++) {
            String numberAsString = arrString[i];
            numbers[i] = Integer.parseInt(numberAsString);
            }

        for (int i = 0; i < numbers.length - 1; i += 2) {
            if (arrString.length % 2 != 0){
                System.out.println("Invalid Length");
                break;
            }
            System.out.println(numbers[i] + ", " + numbers[i + 1] + " -> " + bothOddOrEven(numbers[i], numbers[i + 1]));
        }
    }

    public static String bothOddOrEven(int firstNum, int secondNum){
        String result = "different";
            if (firstNum % 2 == 0 && secondNum % 2 == 0 ) {
                result = "both are even";
            }
            else if (firstNum % 2 != 0 && secondNum % 2 != 0){
                result = "both are odd";
            }
                return result;
    }
}
