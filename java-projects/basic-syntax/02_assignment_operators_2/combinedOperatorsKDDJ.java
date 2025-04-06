public class combinedOperatorsKDDJ {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        if (a > 0 && b > 0) {
            a += b;
            b *= 2;
            System.out.println("Final result of a: " + a);
            System.out.println("Final result of a: " + b);
        } else {
            System.out.println("Either a or b is not positive");
        }
    }
}
