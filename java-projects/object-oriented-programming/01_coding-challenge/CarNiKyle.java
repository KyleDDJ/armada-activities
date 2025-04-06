class Car {
    String brand;
    int year;

    Car (String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lamborghini", 2017);

        car1.displayInfo();
    }
}
