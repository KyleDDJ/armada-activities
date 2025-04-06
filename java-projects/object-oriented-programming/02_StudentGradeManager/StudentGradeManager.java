import java.util.Scanner;

class Student {
    String name;
    int[] grades;

    // Method Overloading for 3 or 4 grades
    public void setDetails(String name, int... grades) {
        this.name = name;
        this.grades = grades;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public String classifyGrade(double average) {
        if (average >= 90 && average <= 100) {
            return "Excellent";
        } else if (average >= 80 && average < 90) {
            return "Good";
        } else if (average >= 70 && average < 80) {
            return "Average";
        } else {
            return "Needs Improvement";
        }
    }

    public void displayDetails() {
        System.out.println("Student: " + name);
        System.out.print("Grades: ");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) System.out.print(", ");
        }
        System.out.println();

        double average = calculateAverage();
        String classification = classifyGrade(average);

        // Display the average rounded to two decimal places
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Classification: " + classification);
    }
}

public class StudentGradeManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter 3 or 4 grades: ");
        String input = scanner.nextLine();
        String[] gradeInputs = input.split(" ");

        if (gradeInputs.length < 3 || gradeInputs.length > 4) {
            System.out.println("Invalid number of grades. Please enter 3 or 4.");
            return;
        }

        int[] grades = new int[gradeInputs.length];
        for (int i = 0; i < gradeInputs.length; i++) {
            grades[i] = Integer.parseInt(gradeInputs[i]);
        }

        student.setDetails(name, grades);
        student.displayDetails();
        scanner.close();
    }
}