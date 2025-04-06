public class assignmentOperatoKDDJ {
    public static void main(String[] args) {
        int x = 10;

        x += 5;
        System.out.println("x after += 5: " + x);

        x -= 3;
        System.out.println("x after -= 3: " + x);

        x *= 2;
        System.out.println("x after *= 2: " + x);

        x /= 4;
        System.out.println("x after /= 4: " + x);

        x %= 3;
        System.out.println("x after %= 3: " + x);

        double price = 100.0;

        price *= 0.8;
        price *= 1.1;

        System.out.println("Final price after discount and tax: " + price);
    }
}
