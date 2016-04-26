import java.util.Scanner;

public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        String[] arrInput = input.split("\\s");

        for (int i = 0; i < arrInput.length; i++) {
            if (i == arrInput.length - 1){
                System.out.println(arrInput[i]);
            }
            else if (arrInput.length == 1){
                System.out.print(arrInput[i]);
            }
            for (int j = i + 1; j < arrInput.length; j++) {
                if (arrInput[i].equals(arrInput[j])){
                    System.out.print(arrInput[j] + " ");
                    break;
                }
                else {
                    System.out.println(arrInput[i]);
                    break;
                }
            }
        }
    }
}
