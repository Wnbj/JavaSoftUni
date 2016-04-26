import java.util.Scanner;

public class CharacterTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Integer.parseInt(input.nextLine());
        char letter = 'a';

        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= i ; j++) {
                System.out.print(letter++ + " ");
            }
            System.out.println();
            letter = 'a';
            if (i==number) {
                for (int k = number - 1; k >= 1; k--) {

                    for (int j = 1; j <= k; j++) {
                        System.out.print(letter++ + " ");
                    }
                    if (k == 1) {
                        break;

                    }
                    System.out.println();
                    letter = 'a';

                }
            }
        }
    }
}
