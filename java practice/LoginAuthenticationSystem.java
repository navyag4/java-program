import java.util.Scanner;
public class LoginAuthenticationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = "admin";
        String pass = "1234";
        for (int i = 1; i <= 3; i++) {

            System.out.print("Username: ");
            String u = sc.next();

            System.out.print("Password: ");
            String p = sc.next();
            if (u.equals(user) && p.equals(pass)){
                System.out.println("Login Successful");
                return;
            } else {           System.out.println("Wrong credentials");
            }
        }
        System.out.println("Account Locked");
    }
}
