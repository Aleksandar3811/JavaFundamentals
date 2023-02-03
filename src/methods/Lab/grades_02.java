package methods.Lab;

import java.util.Scanner;

public class grades_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputGrade = Double.parseDouble(scanner.nextLine());
        printGradesInWords(inputGrade);
    }

    public static void printGradesInWords(double grades) {
        String gradeInWords = "";
        if (grades >= 2.00 && grades <= 2.99) {
            gradeInWords = "Fail";
        }
        if (grades >= 3.00 && grades <= 3.49) {
            gradeInWords = "Poor";
        }
        if (grades >= 3.50 && grades <= 4.49) {
            gradeInWords = "Good";
        }
        if (grades >= 4.50 && grades <= 5.49) {
            gradeInWords = "Very good";
        }
        if (grades >= 5.50 && grades <= 6.00) {
            gradeInWords = "Excellent";
        }
        System.out.println(gradeInWords);
    }
}
