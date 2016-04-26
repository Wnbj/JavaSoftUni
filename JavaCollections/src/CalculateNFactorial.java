import java.util.Scanner;

public class CalculateNFactorial {
    public static void main(String[] args) {
        long n = new Scanner(System.in).nextLong();
        long factorialOfN = factorial(n);

        System.out.println(factorialOfN);
    }
    public static long factorial(long n){
        if (n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
