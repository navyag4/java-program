import java.util.Scanner;

public class ATMwithdarw {
    public static void main(String[] args) {
        System.out.println("Welcome to ATM Withrrawl machine ");
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the balance : ");
        int balance = input.nextInt();
        System.out.println(" Enter the withrawl amount : ");
        int withraw = input.nextInt();

        if ( withraw % 100 == 0 && (balance - withraw) >= 1000){
            System.out.println(" WITHRAWL SUCCESSFULL !!");
            System.out.println(" remaining balance amount : " + (balance - withraw));
        }else{
            System.out.println(" WITHRAWL FAILED !!");
            System.out.println(" given conditions not satisfied");
        }
    }
}
