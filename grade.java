import java.util.Scanner;

public class student{
    public static void main(String[]args){
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int numstd = Scan.nextInt();
        double[] grades = new double[numstd];
        for (int i = 0; i < numstd; i++) {
            System.out.println("Enter the grade for the student " + (i + 1) + ": ");
            grades[i] = Scan.nextDouble();
        }
        double sum = 0;
        double highest = grades[0];
        double lowest = grades[0];
        for (double grade : grades) {
            sum += grade;
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }
        double average = sum / numstd;
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
        Scan.close();
    }
}