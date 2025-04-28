import java.util.Scanner;

// Custom exception class
class AgeRestrictionException extends Exception {
    public AgeRestrictionException(String message) {
        super(message);
    }
}

public class AgeVerification {

    // Method to validate age   
    static void validateAge(int age) throws AgeRestrictionException {
        if (age < 18) {
            throw new AgeRestrictionException("You must be at least 18 to register.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");

        try {
            int userAge = scanner.nextInt(); // Read user input

            // Validate age
            validateAge(userAge);

            // If no exception, registration is successful
            System.out.println("Registration successful!");
        } catch (AgeRestrictionException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        } finally {
            scanner.close();
        }
    }
}
