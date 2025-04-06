import java.util.Scanner;
public class LargestNumberFinderKDDJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int max_numbeString = Integer.MIN_VALUE;;
        int num;

        while (true) {
            System.out.print("Enter a number (-1 to stop): ");
            num = scanner.nextInt();

            if (num == -1){
                break;
            }

            if (num > max_numbeString) {
                max_numbeString = num;
            }
        }
        if (max_numbeString == Integer.MIN_VALUE) {
            System.out.println("No valid numbers were entered");
        } else {
            System.out.println("The largest number entered is: " + max_numbeString);
        }
        scanner.close();
    }
}
