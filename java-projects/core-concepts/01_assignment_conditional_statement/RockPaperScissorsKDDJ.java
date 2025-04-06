import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsKDDJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter your choice (R, P, S): ");
        String user_pick = scanner.nextLine();

        String[] choices = {"R", "P", "S"};
        String computer_choice = choices[random.nextInt(3)];

        System.out.println("Computer chose: " + computer_choice);

        switch (user_pick) {
            case "R":
                if (computer_choice.equals("R")) {
                    System.out.println("It's a tie!");
                } else if (computer_choice.equals("P")) {
                    System.out.println("You lose!");
                } else {
                    System.out.println("You win!");
                }
                break;
            case "P":
                if (computer_choice.equals("P")) {
                    System.out.println("It's a tie!");
                } else if (computer_choice.equals("S")) {
                    System.out.println("You lose!");
                } else {
                    System.out.println("You win!");
                }
                break;
            case "S":
                if (computer_choice.equals("S")) {
                    System.out.println("It's a tie!");
                } else if (computer_choice.equals("R")) {
                    System.out.println("You lose!");
                } else {
                    System.out.println("You win!");
                }
                break;
            default:
                System.out.println("Invalid input. Please enter R, P, or S.");
                break;
        }
        scanner.close();
    }
}
