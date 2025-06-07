import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        ArrayList<Double> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            double grade = scanner.nextDouble();
            grades.add(grade);
        }

        double sum = 0;
        double highest = grades.get(0);
        double lowest = grades.get(0);

        for (double grade : grades) {
            sum += grade;
            if (grade > highest) highest = grade;
            if (grade < lowest) lowest = grade;
        }

        double average = sum / grades.size();

        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
    }
}
