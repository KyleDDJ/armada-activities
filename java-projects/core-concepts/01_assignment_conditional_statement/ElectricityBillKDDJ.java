import java.util.Scanner;
public class ElectricityBillKDDJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of units consumed: ");
        int units = scanner.nextInt();

        double total_bill = 0;

        if (units <= 100) {
            total_bill = units * 1.50;
        } else if (units <= 300) {
            total_bill = (100 * 1.50) + ((units - 100) * 2.50);
        } else {
            total_bill = (100 * 1.50) + (200 * 2.50) + ((units - 300) * 3.50);
        }

        System.out.println("Total bill: "+ total_bill);
        scanner.close();
    }
}
