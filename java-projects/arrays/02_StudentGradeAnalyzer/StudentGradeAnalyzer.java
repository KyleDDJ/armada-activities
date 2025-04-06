import java.util.Scanner;

public class StudentGradeAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        int[] grades = new int [numStudents];
        int sum = 0;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
            sum += grades[i];

            if (grades[i] > highest) {
                highest = grades[i];
            }
            
            if (grades[i] < lowest) {
                lowest = grades[i];
            }

        }

        double average = (double) sum / numStudents;

        System.out.println("\nHighest Grade: " + highest);
        System.out.println("Lowest Grade: " + lowest);
        System.out.println("Average Grade: " + average);

        scanner.close();
    }
}
