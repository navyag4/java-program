import java.util.Scanner;

public class MultiplyWithoutOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = multiply(a, b);
        System.out.println("Product = " + result);
    }
    static int multiply(int a, int b) {
        int result = 0;
        while (b != 0) {
            if ((b & 1) == 1) {
                result = result + a;
            }
            a = a << 1;
            b = b >> 1;
        }
        return result;
    }
}
