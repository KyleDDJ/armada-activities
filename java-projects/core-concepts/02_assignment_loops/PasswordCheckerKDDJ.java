import java.util.Scanner;

public class PasswordCheckerKDDJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correct_pass = "java123";
        String user_pass;

        do {
            System.out.print("Enter password: ");
            user_pass = scanner.nextLine();

            if (!user_pass.equals(correct_pass)) {
                System.out.println("Incorrect password. Try again.\n");
            }
        } while (!user_pass.equals(correct_pass));

        System.out.println("Access granted!");
        scanner.close();
    }
}
