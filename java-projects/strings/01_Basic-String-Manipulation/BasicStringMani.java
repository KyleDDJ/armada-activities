import java.util.Scanner;

public class BasicStringMani {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        String upperCaseName = fullName.toUpperCase();
        System.out.println("Uppercase Name: " + upperCaseName);

        int charCount = 0;
        for (int i = 0; i < fullName.length(); i++) {
            if (fullName.charAt(i) != ' ') {
                charCount++;
            }
        }
        System.out.println("Total Characters (excluding spaces): " + charCount);

        StringBuilder initials = new StringBuilder();
        for (String word : fullName.trim().split("\\s+")) {
            if (!word.isEmpty()) {
                initials.append(word.charAt(0)).append(".");
            }
        }
        System.out.println("Initials: " + initials);

        scanner.close();
    }
}