class Person {
    protected String name;
    protected int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void introduce() {
        System.out.println("Introducing Person:");
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    protected String jobTitle;
    
    public Employee(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
    }
    
    @Override
    public void introduce() {
        System.out.println("Introducing Employee:");
        System.out.println("Name: " + name + ", Age: " + age + ", Job Title: " + jobTitle);
    }
}

class Manager extends Employee {
    protected String department;
    
    public Manager(String name, int age, String jobTitle, String department) {
        super(name, age, jobTitle);
        this.department = department;
    }
    
    @Override
    public void introduce() {
        System.out.println("Introducing Manager:");
        System.out.println("Name: " + name + ", Age: " + age + ", Job Title: " + jobTitle + ", Department: " + department);
    }
}

class Executive extends Manager {
    private String companyCar;
    
    public Executive(String name, int age, String jobTitle, String department, String companyCar) {
        super(name, age, jobTitle, department);
        this.companyCar = companyCar;
    }
    
    @Override
    public void introduce() {
        System.out.println("Introducing Executive:");
        System.out.println("Name: " + name + ", Age: " + age + ", Job Title: " + jobTitle + ", Department: " + department + ", Company Car: " + companyCar);
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);
        person.introduce();
        System.out.println();

        Employee employee = new Employee("Bob", 35, "Software Engineer");
        employee.introduce();
        System.out.println();

        Manager manager = new Manager("Charlie", 40, "Project Manager", "IT");
        manager.introduce();
        System.out.println();

        Executive executive = new Executive("Dave", 45, "Senior Executive", "Finance", "BMW X5");
        executive.introduce();
    }
}
