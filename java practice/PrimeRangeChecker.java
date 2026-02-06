import java.util.Scanner;

public class PrimeRangeChecker {
    public static void main(String[] args) {
        System.out.println("WELCOME TO PRIME NUMBER ");
        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number : ");
        int num1 = input.nextInt();
        System.out.println("enter the second number : ");
        int num2 = input.nextInt();
         for(int num = num1 ; num < num2 ; num ++){
             int count = 0;

             for (int i = 1; i <= num; i++) {
                 if (num % i == 0) {
                     count++;
                 }
             }

             if (count == 2) {
                 System.out.print(num + " ");
             }
         }
    }
}
