import java.util.Scanner;

public class NumClassification {
    public static void main(String[] args) {
        System.out.println(" Welcome to number classification system");
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number please : ");
        int num = input.nextInt();

        // now checking the conditions for a given num
        //for even odd
        if (num > 0){
            System.out.println(" given num is positive");
        } else if (num < 0 ) {
            System.out.println(" num is negative ");

        }else{
            System.out.println("given number is zero");
        }

        // for even odd
        if (num % 2 == 0){
            System.out.println(" num is even ");
        }else{
            System.out.println(" num is odd");
        }

        //to check divisibility by 5 and 7
        if (num % 5 == 0 && num % 7 == 0){
            System.out.println(" The num is divisble by both 5 and 7 ");

        }else{
            System.out.println(" The num is not divisble by both 5 and 7");
        }
    }
}
