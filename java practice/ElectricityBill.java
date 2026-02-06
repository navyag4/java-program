import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        System.out.println(" Enter to electricity bill generator system !!");
        Scanner input = new Scanner(System.in);
        System.out.println(" enter the units consumed : ");
        int units = input.nextInt();
        int bill;
        if(units <= 100){
            bill = units * 2;
        }else if(units > 100 && units <= 200){
            bill = (100 * 2) + (units - 100)*3;

        }else{
            bill = (100 * 2) + ( 100 * 3) + (units - 200)*5;

        }
        bill = bill + 150;
        System.out.println("The total bill is : ₹" + bill );
    }
}
