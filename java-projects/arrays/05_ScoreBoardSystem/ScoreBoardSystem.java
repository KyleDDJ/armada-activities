import java.util.Scanner;

public class ScoreBoardSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of Students: ");
        int studentNum = scanner.nextInt();

        System.out.print("Enter the number of subjects: ");
        int subjectNum = scanner.nextInt();

        int[][] scores = new int[studentNum][subjectNum];

        for (int i = 0; i < studentNum; i++) {
            System.out.print("Enter scores fot Student " + (i + 1) + ": ");
            for (int j = 0; j < subjectNum; j++) {
                scores[i][j] = scanner.nextInt();
            }
        }

        System.out.println();
    
        for (int i = 0; i < studentNum; i++) {
            int total = 0;
            for (int j = 0; j < scores.length; j++) {
                total = total + scores[i][j];
            }
                    
            double average = (double) total / subjectNum;
            System.out.printf("Student %d - Total: %d, Average: %.2f\n", i + 1, total, average);
        }
        scanner.close();
    }
    
}
