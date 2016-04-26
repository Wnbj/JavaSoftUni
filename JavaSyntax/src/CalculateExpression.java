import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double numberA = console.nextDouble();
        double numberB = console.nextDouble();
        double numberC = console.nextDouble();

        double firstResult = formulaOne(numberA, numberB, numberC);
        double secondResult = formulaTwo(numberA, numberB, numberC);

        double averageNums = (numberA + numberB + numberC) / 3;
        double averageFormulas = (firstResult + secondResult) / 2;
        double diff = Math.abs(averageNums - averageFormulas);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", firstResult, secondResult, diff);

    }

    public static double formulaOne(double numA, double numB, double numC){
        double pow = (numA + numB + numC) / Math.sqrt(numC);
        double result = Math.pow((Math.pow(numA, 2) + Math.pow(numB, 2)) / (Math.pow(numA, 2) - Math.pow(numB, 2)), pow);
        return result;
    }

    public static double formulaTwo(double numA, double numB, double numC){
        double pow = numA - numB;
        double result = Math.pow(Math.pow(numA, 2) + Math.pow(numB, 2) - Math.pow(numC, 3), pow);
        return result;
    }
}
