import java.util.Scanner;

public class fromDecimalToBase7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        String num7 = Integer.toString(number, 7);
        int num7int = Integer.parseInt(num7);

        System.out.println(num7int);

    }
}
