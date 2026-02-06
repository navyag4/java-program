import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter the valvue of n : ");
        int n = input.nextInt();

        for(int i = 1 ; i <= n ; i ++){
            for(int j = 1 ; j <=i ; j ++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
