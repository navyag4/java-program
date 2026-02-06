import java.util.Scanner;

public class MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int max = max(a, b);
        System.out.println("Maximum = " + max);
    }

    static int max(int a, int b) {
        int diff = a - b;
        int sign = (diff >> 31) & 1;
        return a - sign * diff;
    }
}
