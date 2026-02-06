import java.util.Scanner;

public class ReverseDattaAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a num :");
        int num = input.nextInt();

        int original = num;
        int reverse = 0;
        int sum = 0;
        int count = 0;


         while(num != 0 ){
             int digit = num % 10;
             reverse = reverse * 10 + digit;
             sum = sum + digit;
             count++;
             num = num /10;
        }
         //using for loop-->
        /* for( ; num != 0 ; num = num/10)
        int digit = num % 10;
        reverse = reverse * 10 + digit;
         */
        System.out.println("original number: " + original);
        System.out.println("reverse: " + reverse);
        System.out.println("sum: " + sum);
        System.out.println("count: " + count);

    }
}
