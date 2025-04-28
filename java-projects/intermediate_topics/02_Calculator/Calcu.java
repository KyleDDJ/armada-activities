import java.util.InputMismatchException;
import java.util.Scanner;

public class Calcu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int firstNum = scanner.nextInt();

            System.out.print("Enter second number: ");
            int secondNum = scanner.nextInt();

            int result = firstNum / secondNum;
            System.out.print("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter numbers only.");
        }

        scanner.close();
    }
}