import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class GetFirstOddEven {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inputNumbers = console.nextLine();
        String condition = console.nextLine();
        String[] arrCondition = condition.split("\\s");
        int numbersToReturn = Integer.parseInt(arrCondition[1]);
        String oddOrEven = arrCondition[2];

        String[] arrNumbers = inputNumbers.split("\\s");
        int[] arrNumbersInt = new int[arrNumbers.length];

        for (int i = 0; i < arrNumbers.length; i++) {
            arrNumbersInt[i] = Integer.parseInt(arrNumbers[i]);
        }
        oddEvenElements(arrNumbersInt, numbersToReturn, oddOrEven);
        for (Integer integer : oddEvenElements(arrNumbersInt, numbersToReturn, oddOrEven)) {
            System.out.print(integer + " ");
        }
    }
    public static List<Integer> oddEvenElements (int[] arrNumbers, int numbersToReturn, String oddOrEven){
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < arrNumbers.length; i++) {
            if (arrNumbers[i] % 2 == 0 && Objects.equals(oddOrEven, "even")){
                numbers.add(arrNumbers[i]);
                if (i == numbersToReturn){
                    break;
                }
            }
            else if (arrNumbers[i] % 2 != 0 && Objects.equals(oddOrEven, "odd")){
                numbers.add(arrNumbers[i]);
                if (i == numbersToReturn){
                    break;
                }
            }
        }
        return numbers;
    }
}
