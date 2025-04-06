public class logicalOperatorsKDDJ {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println("a && b: " + (a && b));
        System.out.println("a || b: " + (a || b));
        System.out.println("!a: " + (!a));
        System.out.println("!b: " + (!b));

        int creditScore;
        double annualIncome;

        creditScore = 750;
        annualIncome = 60000.0; 

        if (creditScore > 700 && annualIncome > 50000) {
            System.out.println("Person is eligible for a loan");
        } else {
            System.out.println("Person is not eligible for a loan");
        }
    }
}
