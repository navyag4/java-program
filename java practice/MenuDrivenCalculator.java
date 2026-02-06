import java.util.Scanner;

class MenuDrivenCalculator {
    public static void main(String[] args) {
        System.out.println(" Welcome to menu-driven calculator");
        Scanner input = new Scanner(System.in);

        //giving the inputs

        System.out.println("enter the first num : ");
        int num1 = input.nextInt();

        System.out.println("enter the second num : ");
        int num2 = input.nextInt();

        //display - menu
        System.out.println("\n---calculator menu--- ");
        System.out.println("1) ADDITION");
        System.out.println("2) SUBSTRACTION");
        System.out.println("3) MULTIPLICATION");
        System.out.println("4) DIVISION");
        System.out.println("5) MODULUS");

        System.out.println("enter your choice");
        int choice = input.nextInt();

        switch(choice){
            case 1:
                System.out.println("the result is : " + (num1 + num2));
                break;
            case 2:
                System.out.println("the result is : " + (num1 - num2));
                break;
            case 3:
                System.out.println("the result is : " + (num1 * num2));
                break;
            case 4 :
                if(num2 != 0) {
                    System.out.println("result is : " + (num1 / num2));
                }else{
                    System.out.println("division is not possible ");
                }
                break;
            case 5:
                System.out.println("the result is : " + (num1 % num2));
                break;
            }

        input.close();
        }
    }

// why do we not apply the closing "}" at last for class???