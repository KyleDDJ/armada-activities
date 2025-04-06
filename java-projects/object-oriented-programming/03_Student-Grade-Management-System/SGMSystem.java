import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int id;
    double grade;
    static final String SCHOOL_NAME = "Don Mariano Marcos Memorial State University";

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public void displayDetails(int index) {
        System.out.println("Student " + (index + 1) + ":");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.printf("Grade: %.2f%n", grade);
    }
}

public class SGMSystem {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nWelcome to the Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student Grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    updateStudentGrade();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    public static void addStudent() {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();

        System.out.print("Enter student grade: ");
        double grade = scanner.nextDouble();

        students.add(new Student(name, id, grade));
        System.out.println("Student added successfully!");
    }

    public static void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.println("--- Student Records ---");
        System.out.println("School: " + Student.SCHOOL_NAME);
        
        for (int i = 0; i < students.size(); i++) {
            students.get(i).displayDetails(i);
            System.out.println();
        }
    }

    public static void updateStudentGrade() {
        if (students.isEmpty()) {
            System.out.println("No students available to update.");
            return;
        }

        System.out.print("Enter student ID to update: ");
        int id = scanner.nextInt();
        boolean found = false;

        for (Student student : students) {
            if (student.id == id) {
                System.out.print("Enter new grade: ");
                double newGrade = scanner.nextDouble();
                student.grade = newGrade;
                System.out.println("Grade updated successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
}
