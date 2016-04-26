import java.util.Scanner;

public class FormatingNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstNum = console.nextInt();
        double secondNum = console.nextDouble();
        double thirdNum = console.nextDouble();
        String firstBinary = Integer.toBinaryString(firstNum);
        int firstBinaryInt = Integer.parseInt(firstBinary);

        System.out.printf("|%-10X|%010d| %10.2f|%-10.3f|", firstNum, firstBinaryInt, secondNum, thirdNum);
    }
}
