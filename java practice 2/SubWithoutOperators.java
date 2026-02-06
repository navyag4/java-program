import java.util.Scanner;

public class SubWithoutOperators {

    // bitwise addition method
    static int add(int x, int y) {
        while (y != 0) {
            int carry = x & y;
            x = x ^ y;
            y = carry << 1;
        }
        return x;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // subtraction using two's complement
        int result = add(a, add(~b, 1));

        System.out.println("Result = " + result);
        sc.close();
    }
}

