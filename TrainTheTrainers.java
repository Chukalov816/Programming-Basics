package NestedLoopExercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        double allGradesSum = 0.0;
        int counter = 0;

        while (!input.equals("Finish")) {
            String presentation = input;
            counter++;
            double gradeSum = 0.0;
            double averageGrade = 0.0;
            for (int i = 1; i <= n; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                gradeSum += grade;
            }
            averageGrade = gradeSum / n;
            allGradesSum += averageGrade;
            System.out.printf("%s - %.2f.%n", presentation, averageGrade);

            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", allGradesSum / counter);
    }
}
