import java.util.Scanner;

public class LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        String[] arrInput = input.split("\\s");
        int endIndex = 0;
        int counter = 0;
        int bestCounter= 0;
        int maxEndIndex = 0;

        for (int i = 0; i < arrInput.length; i++) {
            for (int j = i + 1; j < arrInput.length; j++) {
                if (arrInput[i].equals(arrInput[j])){
                    endIndex = j;
                    counter++;
                }
            }
            if (bestCounter == counter && counter != 0){
                break;
            }
            if (counter > bestCounter){
                bestCounter = counter;
                counter = 0;
            }
            else if (endIndex > maxEndIndex){
                maxEndIndex = endIndex;
                counter = 0;
            }
        }
        int startIndex = maxEndIndex - bestCounter;

        for (int i = startIndex; i <= maxEndIndex; i++) {
            System.out.print(arrInput[i] + " ");
        }
    }
}
