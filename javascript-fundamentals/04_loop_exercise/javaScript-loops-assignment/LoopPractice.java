public class LoopPractice {
    public static void main(String[] args) {
        multiplicationTable(); // Task
        System.out.println(); // Space
        sumOfNaturalNumbers();
        System.out.println(); 
        arrayElements();
        System.out.println();
        patternPrinter();
        System.out.println();
        reverseArray();

    }

    // Task 1: Multiplication Table Generator
    public static void multiplicationTable() {
        int number = 9;
        System.out.println("Multiplication Table for " + number + ":");
        
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
    }

    // Task 2: Sum of First N Natural Numbers
    public static void sumOfNaturalNumbers() {
        int n = 5; 
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        System.out.println("The sum of the first " + n + " numbers is: " + sum);
    }

    // Task 3: Array Elements Printer
    public static void arrayElements() {
        int[] num = {2, 4, 6, 8, 10};
        System.out.println();

        for (int i = 0; i < num.length; i++) {
            System.out.println("Array Elements: " + num[i]);
        }
    }

    // Task 4: Pattern Print
    public static void patternPrinter() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
            System.out.print("*"); 
        }
        System.out.println();
        }
    }

    // Task 5: Reverse Array Element
    public static void reverseArray() {
        int[] numbers = {1, 3, 5, 7, 9};
        
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("Reversed Element: " + numbers[i]);
        }
    }
}
