import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        double[] grades = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = sc.nextDouble();
        }

        double sum = 0, highest = grades[0], lowest = grades[0];
        for (double grade : grades) {
            sum += grade;
            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;
        }

        double average = sum / n;
        System.out.printf("Average: %.2f\n", average);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
    }
}