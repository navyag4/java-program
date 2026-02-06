import java.util.Scanner;

public class DivideWithoutOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Cannot divide by zero.");
            return;
        }

        int quotient = 0;
        int sign = 1;

        if (dividend < 0) {
            dividend = -dividend;
            sign *= -1;
        }
        if (divisor < 0) {
            divisor = -divisor;
            sign *= -1;
        }

        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }
        System.out.println("Quotient: " + (quotient * sign));
    }

}
