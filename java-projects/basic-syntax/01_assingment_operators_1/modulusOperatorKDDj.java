public class modulusOperatorKDDj {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 4;

        int remainder = num1 % num2;
        System.out.println("Remainder of " + num1 + " divided by " + num2 + " is " + remainder);

        if (num1 % num2 == 0) {
            System.out.println(num1 + " is divided by " + num2);
        } else {
            System.out.println(num1 + " is NOT divisible by " + num2);
        } 
    }
}