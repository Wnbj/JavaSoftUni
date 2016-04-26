import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter A point coordinates: ");
        int aX = console.nextInt();
        int aY = console.nextInt();
        System.out.print("Enter B point coordinates: ");
        int bX = console.nextInt();
        int bY = console.nextInt();
        System.out.print("Enter C point coordinates: ");
        int cX = console.nextInt();
        int cY = console.nextInt();

        int area = Math.abs((aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2);
        System.out.print(area);

    }
}
