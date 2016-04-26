import java.util.Scanner;

public class FromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String number7Base = console.next();
        int num10Int = Integer.valueOf(number7Base, 7);

        System.out.println(num10Int);

    }
}
