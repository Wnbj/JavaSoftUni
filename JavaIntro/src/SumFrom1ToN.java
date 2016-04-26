import java.util.Scanner;

public class SumFrom1ToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        int sum = 0;

        for (int i = number; i >= 0; i--) {
            sum += i;
        }
        System.out.println(sum);
    }
}
