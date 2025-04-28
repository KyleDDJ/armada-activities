import java.io.*;
import java.util.*;

interface Archivable {
    boolean archive();
}

class Subject {
    private String code;
    private String description;
    private double grade;

    public Subject(String code, String description, double grade) {
        this.code = code;
        this.description = description;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public String toString() {
        return code + " - " + description + " (Grade: " + grade + ")";
    }
}

class Student implements Archivable {
    private String name;
    private String id;
    private List<Subject> subjects = new ArrayList<>();

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public double calculateGPA() {
        if (subjects.isEmpty()) return 0.0;
        double sum = 0;
        for (Subject s : subjects) {
            sum += s.getGrade();
        }
        return sum / subjects.size();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(name).append("\nID: ").append(id).append("\n");
        for (Subject s : subjects) {
            sb.append("- ").append(s.toString()).append("\n");
        }
        sb.append("GPA: ").append(String.format("%.2f", calculateGPA())).append("\n");
        return sb.toString();
    }

    @Override
    public boolean archive() {
        return calculateGPA() >= 3.5;
    }
}

class Transcript {
    public static void display(Student student) {
        System.out.println("\n--- Transcript ---");
        System.out.println(student);
    }
}

public class Main {
    static List<Student> students = new ArrayList<>();
    static final String FILE_NAME = "C:\\Users\\ACER\\Desktop\\armada-activities\\final-assigment\\Student-Record-Management-System\\StudentRec.txt";

    public static void main(String[] args) {
        loadFromFile();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        do {
            System.out.println("\nSTUDENT RECORDS SYSTEM");
            System.out.println("1. Add Student");
            System.out.println("2. Add Subject to Student");
            System.out.println("3. View Transcript");
            System.out.println("4. Sort by Name");
            System.out.println("5. Archive Eligible Students");
            System.out.println("6. Save & Exit");
            System.out.println("7. Update Student Info");
            System.out.print("Enter choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1 -> addStudent(scanner);
                    case 2 -> addSubject(scanner);
                    case 3 -> viewTranscript(scanner);
                    case 4 -> {
                        students.sort(Comparator.comparing(Student::getName));
                        System.out.println("Sorted by name.");
                        for (Student s : students) {
                            System.out.println(s.getName() + " (ID: " + s.getId() + ")");
                        }
                    }
                    case 5 -> archiveStudents();
                    case 6 -> saveToFile();
                    case 7 -> updateStudentInfo(scanner);
                    default -> System.out.println("Invalid choice.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }

        } while (choice != 6);
    }

    static void addStudent(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim();
        System.out.print("Enter ID: ");
        String id = scanner.nextLine().trim();

    
        //Check if name already exists
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println("A student with this name already exists. Cannot add duplicate.");
                return; //Exit without adding
            }
        }
    
        students.add(new Student(name, id));
        System.out.println("Student added.");
    }

    static void addSubject(Scanner scanner) {
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        Student student = findStudentById(id);
        if (student != null) {
            try {
                System.out.print("Subject code: ");
                String code = scanner.nextLine();
                System.out.print("Description: ");
                String desc = scanner.nextLine();
                System.out.print("Grade (0.0 - 4.0): ");
                double grade = Double.parseDouble(scanner.nextLine());

                if (grade < 0.0 || grade > 4.0) {
                    System.out.println("Invalid grade.");
                    return;
                }
                student.addSubject(new Subject(code, desc, grade));
                System.out.println("Subject added.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for grade.");
            }
        } else {
            System.out.println("Student not found.");
        }
    }

    static void viewTranscript(Scanner scanner) {
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        Student student = findStudentById(id);
        if (student != null) Transcript.display(student);
        else System.out.println("Student not found.");
    }

    static void archiveStudents() {
        System.out.println("\n--- Archive Candidates (GPA 3.5+) ---");
        for (Student s : students) {
            if (s.archive()) System.out.println(s.getName() + " [GPA: " + String.format("%.2f", s.calculateGPA()) + "]");
        }
    }

    static Student findStudentById(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) return s;
        }
        return null;
    }

    static void updateStudentInfo(Scanner scanner) {
        System.out.print("Enter current student ID: ");
        String id = scanner.nextLine();
        Student student = findStudentById(id);
        if (student != null) {
            System.out.print("Enter new name (press enter to keep current): ");
            String newName = scanner.nextLine();
            System.out.print("Enter new ID (press enter to keep current): ");
            String newId = scanner.nextLine();

            if (!newName.trim().isEmpty()) student.setName(newName);
            if (!newId.trim().isEmpty()) student.setId(newId);

            System.out.println("Student info updated.");
        } else {
            System.out.println("Student not found.");
        }
    }

    static void saveToFile() {
        try (PrintWriter out = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (Student s : students) {
                out.println("#" + s.getName() + "," + s.getId());
                for (Subject subj : s.getSubjects()) out.println("-" + subj.toString());
            }
            System.out.println("Records saved. Exiting...");
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    static void loadFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (Scanner fileScanner = new Scanner(file)) {
            Student current = null;
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                if (line.startsWith("#")) {
                    String[] parts = line.substring(1).split(",");
                    current = new Student(parts[0], parts[1]);
                    students.add(current);
                } else if (line.startsWith("-")) {
                    String[] parts = line.substring(1).split(" - | \\(Grade: |\\)");
                    if (parts.length >= 3) {
                        String code = parts[0].trim();
                        String desc = parts[1].trim();
                        double grade = Double.parseDouble(parts[2].trim());
                        current.addSubject(new Subject(code, desc, grade));
                    }
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }
}
