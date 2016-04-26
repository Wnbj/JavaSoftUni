import java.util.Scanner;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] arrInput = console.nextLine().split(" ");
        int[] intArr = new int[arrInput.length];
        int counter = 0;
        int bestCounter = 0;
        int endElement = 0;

        for (int i = 0; i < arrInput.length; i++) {
            intArr[i] = Integer.parseInt(arrInput[i]);
        }
        for (int i = 0; i < intArr.length -1 ; i++) {
                if (intArr[i + 1] > intArr[i]) {

                    if (i == intArr.length - 2){
                        System.out.print(intArr[i] + " " + intArr[i + 1]);
                        counter++;
                    }else{
                        System.out.print(intArr[i] + " ");
                    }
                    counter++;
                    if (counter > bestCounter){
                        bestCounter = counter;
                        endElement = i + 1;
                    }
                }else{
                    if (i == intArr.length - 2){
                        System.out.print( intArr[i] + "\n" + intArr[i + 1]);
                    }else{
                    System.out.println(intArr[i]);
                    }
                    counter++;
                    if (counter > bestCounter){
                        bestCounter = counter;
                    }
                    counter = 0;
                }
        }
        int firstElement = endElement - bestCounter + 1;
        System.out.print("\nLongest: ");
        for (int i = firstElement; i <= endElement; i++) {
            System.out.print(intArr[i] + " ");
        }
    }
}
