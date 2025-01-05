
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of grades: ");
        int Grades = scanner.nextInt();

        float sum = 0;
        float highest = Float.MIN_VALUE;
        float lowest = Float.MAX_VALUE;

        for (int i = 0; i < Grades; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            float grade = scanner.nextFloat();

            sum=sum+grade;

            if (grade > highest) {
                highest = grade;
            }

            if (grade < lowest) {
                lowest = grade;
            }
        }

        float average = sum / Grades;

        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }
}