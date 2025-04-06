import java.util.Scanner;

interface PaymentMethod {
    void processPayment(double amount);
}
class CreditCard implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.print("Processing credit payment of $" + amount);
    }
}
class PayPal implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.print("Processing PayPal payment of $" + amount);
    }
}
class CryptoCurrency implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.print("Processing cryptocurrency of $" + amount);
    }
}
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose payment method(1: Credit Card, 2: PayPal, 3: CryptoWallet): ");
        int userChoice = scanner.nextInt();

        PaymentMethod paymentMethod = null;

        if (userChoice == 1) {
            paymentMethod = new CreditCard();
        } else if (userChoice == 2) {
            paymentMethod = new PayPal();
        } else if (userChoice == 3) {
            paymentMethod = new CryptoCurrency();
        }  else {
            System.out.println("Invalid choice!");
            scanner.close();
            return;
        }

        System.out.print("Enter payment amount: ");
        double amount = scanner.nextDouble();

        paymentMethod.processPayment(amount);

        scanner.close();
    }
}