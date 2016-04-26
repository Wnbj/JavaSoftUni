import java.util.Scanner;

public class GetAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        double firstNum = Double.parseDouble(input.next());
        System.out.print("b = ");
        double secondNum = Double.parseDouble(input.next());
        System.out.print("c = ");
        double thirdNum = Double.parseDouble(input.next());

        calculateAverage(firstNum, secondNum, thirdNum);

    }
        private static void calculateAverage(double first, double second, double third ){
            double average = (first + second + third) / 3;
            System.out.printf("%.2f", average);
        }
}
