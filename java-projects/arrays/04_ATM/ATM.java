import java.util.Scanner;
import java.util.Arrays;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] balances = {5000, 3000, 7000, 1000, 4000};

        System.out.println("Available accounts: ");
        for (int i = 0; i < balances.length; i++) {
            System.out.println("[" + i + "] Account " + (i + 1));
        }

        System.out.print("\nEnter account index (0-4): ");
        int index = scanner.nextInt();

        if (index < 0 || index >= balances.length) {
            System.out.println("Invalid account index. Exiting...");
            scanner.close();
            return;
        }

        System.out.println("Current balance: " + balances[index]);

        System.out.print("\nEnter transaction type (1-Withdraw, 2-Deposit): ");
        int transactionType = scanner.nextInt();

        switch (transactionType) {
            case 1: // Withdraw
                System.out.print("Enter amount to withdraw: ");
                int withdrawAmount = scanner.nextInt();
                if (withdrawAmount <= balances[index]) {
                    balances[index] -= withdrawAmount;
                    System.out.println("Transaction successful!");
                    System.out.println("New balance: " + balances[index]);
                } else {
                    System.out.println("Insufficient balance!");
                }
                break;

            case 2: // Deposit
                System.out.print("Enter amount to deposit: ");
                int depositAmount = scanner.nextInt();
                balances[index] += depositAmount;
                System.out.println("Deposit successful!");
                System.out.println("New balance: " + balances[index]);
                break;

            default:
                System.out.println("Invalid transaction type.");
        }
        
        scanner.close();
    }
}
