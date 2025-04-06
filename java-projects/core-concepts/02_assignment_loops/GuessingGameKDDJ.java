import java.util.Scanner;
import java.util.Random;

public class GuessingGameKDDJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
    
        int randomNumber = random.nextInt(50) + 1;
        int attempts = 0;
        int guesed = 0;
    
        System.out.println("Welcome to the Number Guessing Game!");

        while (guesed != randomNumber) {
            System.err.print("Guess a nummber between 1 and 50: ");
            guesed = scanner.nextInt();
            attempts++;

            if (guesed < randomNumber) {
                System.out.println("Too low! Add more.");
            } else if ( guesed > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts");
                break;
            }
        }
        scanner.close();
    }
}
