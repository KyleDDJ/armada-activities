import java.util.Scanner;
import java.util.Arrays;

public class InventoryStockManagement  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stock[] = {10, 25, 14, 30, 5, 18, 22, 40, 12, 8};

        System.out.println("Current stock levels: ");
        System.out.println(Arrays.toString(stock));

        System.out.println("\nEnter the product index to update (0-9): ");
        int index = scanner.nextInt();

        if (index < 0 || index >= stock.length) {
            System.out.println("Invalid index. Exiting Program.");
            scanner.close();
            return;
        }

        System.out.print("Enter the new stock value: ");
        int newStock = scanner.nextInt();

        stock[index] = newStock;
        System.out.println("\nUpdated stock levels: ");
        System.out.println(Arrays.toString(stock));

        int highest = stock[0];
        int lowest = stock[0];

        for (int i = 1; i < stock.length; i++) {
            if (stock[i] > highest) {
                highest = stock[i];
            }
            if (stock[i] < lowest) {
                lowest = stock[i];
            }
        }  
        
        System.out.println("\nHighest Stock: " + highest);
        System.out.println("Lowest Stock: " + lowest);

        scanner.close();

    }
}
