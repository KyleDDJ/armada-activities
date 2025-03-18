public class relationalOperatorsKDDJ {
    public static void main(String[] args) {
        int x = 30;
        int y= 19;

        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));

        if (x >= 10 && x <= 50) {
            System.out.println("x is within the range 10 to 50");
        } else {
            System.out.println("x is outside the range 10 to 50");
        }
    }
}
