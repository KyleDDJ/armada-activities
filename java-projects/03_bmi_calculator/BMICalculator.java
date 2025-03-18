import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float weight, height, bmi;
        String healthStatus;

        System.out.print("Enter your weight (kg): ");
        weight = Float.parseFloat(scanner.nextLine());
        System.out.print("Enter your height (m): ");
        height = Float.parseFloat(scanner.nextLine());

        bmi = weight / (height * height);

        healthStatus = (bmi < 18.5) ? "Underweight" :
                       (bmi >= 18.5 && bmi < 24.9) ? "Normal" :
                       (bmi >= 25 && bmi < 29.9) ? "Overweight" :
                       "Obese";

        System.out.println("\n===BMI Report");
        System.out.println("Your BMI: " + bmi + "%");
        System.out.println("Health Status: " + healthStatus);
        
        scanner.close();
    }
}