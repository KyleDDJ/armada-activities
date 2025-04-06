class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    private char grade;

    public Student(String name, int age, char grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayGrade() {
        System.out.println("Grade: " + grade);
    }
}

public class CodingChallenge {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, 'A');

        student.displayInfo();
        student.displayGrade();
    }
}