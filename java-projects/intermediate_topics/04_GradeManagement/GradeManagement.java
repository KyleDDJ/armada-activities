import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String toString() {
        return name + " - " + grade;
    }
}


public class GradeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();


        int choice;
        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Update Grade");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    double grade = scanner.nextDouble();
                    studentList.add(new Student(name, grade));
                    System.out.println("Student added!");
                    break;

                case 2:
                    System.out.println("Student List:");
                    if (studentList.isEmpty()) {
                        System.out.println("No Student found.");
                    } else {
                        for (Student s : studentList) {
                            System.out.println(s);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter student name: ");
                    String updateName = scanner.nextLine();
                    boolean found = false;
                    for (Student s : studentList) {
                        if (s.getName().equalsIgnoreCase(updateName)) {
                            System.out.print("Enter new grade: ");
                            double newGrade = scanner.nextDouble();
                            s.setGrade(newGrade);
                            System.out.println("Grade updated!");
                            found = true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("Student not found!");
                    }
                    break;
                case 4:
                    System.out.print("Enter student name to remove: ");
                    String studentRemove = scanner.nextLine();
                    boolean removed = false;
                    for (int i = 0; i < studentList.size(); i++) {
                        if (studentList.get(i).getName().equalsIgnoreCase(studentRemove)) {
                            studentList.remove(i);
                            System.out.println("Student removed.");
                            removed = true;
                            break;
                        }
                    }
                     if (!removed) {
                        System.out.println("Student not found!");
                    }
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;   
                default:
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice !=5);
    }
}
