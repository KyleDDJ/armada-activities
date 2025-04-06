import java.util.Scanner;
public class GradingSystemKDDJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.print("Enter your score: ");
        int score = scanner.nextInt();

        String grade;
        String feedback;

        if (score >= 90) {
            grade = "A";
            feedback = "Excellent!";
        } else if (score >= 75){
            grade = "B";
            feedback = "Good job!";
        } else if (score >= 50) {
            grade = "C";
            feedback = "You passed.";
        } else {
            grade = "F";
            feedback = "Better luck next time.";
        }

        System.out.println("Grade: " + grade);
        System.out.println("Feedback: " + feedback);
        scanner.close();
    }
}
