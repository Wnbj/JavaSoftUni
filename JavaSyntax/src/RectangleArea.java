import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter lenght: ");
        int lenght = console.nextInt();
        System.out.print("Enter width: ");
        int width = console.nextInt();

        int area = lenght * width;
        System.out.printf("The area of the rectangle is %d", area);
    }
}
