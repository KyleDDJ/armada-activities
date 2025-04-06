import java.util.ArrayList;
import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<String> transactionHistory;
    private static final double INTEREST_RATE = 0.5;

    public BankAccount(String accountNumber, String accountHolder, double initialDeposit) {
        if (!accountNumber.matches("\\d{10}")) {
            throw new IllegalArgumentException("Error: Account number must be exactly 10 digits.");
        }
        if (accountHolder == null || accountHolder.trim().isEmpty()) {
            throw new IllegalArgumentException("Error: Account holder name cannot be empty.");
        }
        if (initialDeposit < 0) {
            throw new IllegalArgumentException("Error: Initial deposit must be a positive amount.");
        }

        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
        this.transactionHistory = new ArrayList<>();
        this.transactionHistory.add("Account created with initial deposit: $" + initialDeposit);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be greater than 0.");
            return;
        }
        balance += amount;
        transactionHistory.add("Deposit: $" + amount);
        System.out.println("Deposit successful. New Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be greater than 0.");
            return;
        }
        if (amount > balance) {
            System.out.println("Error: Insufficient funds.");
            return;
        }
        balance -= amount;
        transactionHistory.add("Withdraw: $" + amount);
        System.out.println("Withdrawal successful. New Balance: $" + balance);
    }

    public void applyInterest() {
        double interest = balance * (INTEREST_RATE / 100);
        balance += interest;
        transactionHistory.add("Interest Applied: $" + interest);
        System.out.println("Interest applied. New Balance: $" + balance);
    }

    public void accountDetails() {
        System.out.println("--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

    public void transactionHistory() {
        System.out.println("--- Transaction History ---");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;

        while (true) {
            System.out.println("\nWelcome to the Secure Banking System");
            System.out.println("1. Create Account");
            System.out.println("2. View Account Details");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Apply Interest");
            System.out.println("6. View Transaction History");
            System.out.println("7. Exit");
            System.out.print("\nEnter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number (10 digits): ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("Enter Account Holder Name: ");
                    String accountHolder = scanner.nextLine();
                    System.out.print("Enter Initial Deposit: ");
                    double initialDeposit = scanner.nextDouble();
                    try {
                        account = new BankAccount(accountNumber, accountHolder, initialDeposit);
                        System.out.println("Account created successfully!");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    if (account != null) {
                        account.accountDetails();
                    } else {
                        System.out.println("Error: No account found. Please create an account first.");
                    }
                    break;
                case 3:
                    if (account != null) {
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                    } else {
                        System.out.println("Error: No account found. Please create an account first.");
                    }
                    break;
                case 4:
                    if (account != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                    } else {
                        System.out.println("Error: No account found. Please create an account first.");
                    }
                    break;
                case 5:
                    if (account != null) {
                        account.applyInterest();
                    } else {
                        System.out.println("Error: No account found. Please create an account first.");
                    }
                    break;
                case 6:
                    if (account != null) {
                        account.transactionHistory();
                    } else {
                        System.out.println("Error: No account found. Please create an account first.");
                    }
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
