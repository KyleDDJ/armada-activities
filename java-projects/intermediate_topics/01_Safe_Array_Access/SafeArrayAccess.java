import java.util.Scanner;

public class SafeArrayAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.print("Enter an index (0-4): ");
        int userInput = scanner.nextInt();

        try {
            System.out.println("Element at index " + userInput + ": " + numbers[userInput]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. Please enter a number between 0 and 4.");
        }

        scanner.close();
    }
}