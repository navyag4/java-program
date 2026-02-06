import java.util.Scanner;

public class SmartBillingSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to smart billing system");
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the price :");
        int price = input.nextInt();

        System.out.println(" Enter the Quantity :");
        int Quantity = input.nextInt();

        double TotalBill = price * Quantity;
        double discount = 0;

        if(TotalBill >= 2000){
            System.out.println(" u will gwt 5% discount ");
            discount = TotalBill * 0.10;

        }else if(TotalBill >= 5000){
            System.out.println(" u will get 10% discount ");
            discount = TotalBill * 0.5;

        }else{
            System.out.println(" no discount ");
        }
        double discountedAmount  = TotalBill - discount;
        double gst = discountedAmount * 0.18;
        double TotalAmount = discountedAmount + gst;

        System.out.println("total bill :" + TotalBill);
        System.out.println("discount :" + discount);
        System.out.println("gst :" + gst) ;
        System.out.println("final amount : " + TotalAmount);


    }
}

