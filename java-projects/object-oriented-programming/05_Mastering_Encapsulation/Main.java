class Student {
    private String name;
    private int age;

    public void setName (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int setName() {
        return age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("John Doe");
        student.setAge(20);

        student.displayInfo();
    }
}