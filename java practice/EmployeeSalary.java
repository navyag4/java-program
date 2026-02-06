import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        System.out.println(" Welcome to employee salary calculator");
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the salary :");
        int salary = input.nextInt();
        double hra,da;
        double pf = salary * 0.12; // to deduct 12 % of basic salary

        //condition for hra and da
        if(salary >=30000){
            hra = 0.2 * salary;
            da = 0.15 * salary;

        }else{
            hra = 0.10 * salary;
            da = 0.08 * salary;
        }
        double netsalary = salary + hra + da - pf ;
        System.out.println("provided hra and dra are :" + hra + " and " + da );
        System.out.println(" pf  deducted is : " + pf);
        System.out.println("net salary : " + netsalary);


    }
}
