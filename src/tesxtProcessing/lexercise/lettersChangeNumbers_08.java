package tesxtProcessing.lexercise;

import java.util.Scanner;

public class lettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        double totalSum = 0;
        for (String code : input) {
            double modifiedNumber = getModifiedNumber(code);
            totalSum += modifiedNumber;
        }
        System.out.printf("%.2f", totalSum);
    }

    public static double getModifiedNumber(String code) {
        char letterBefore = code.charAt(0);
        char letterAfter = code.charAt(code.length()-1);
        double number = Double.parseDouble(code.replace(letterBefore,' ')
                .replace(letterAfter,' ')
                .trim());
        number = modifyLetterBefore(letterBefore, number);
        number = modifyLetterAfter(letterAfter, number);
        return number;
    }

    public static double modifyLetterAfter(char letterAfter, double number) {
        if (Character.isUpperCase(letterAfter)) {
            int positionUpperCase = (int) letterAfter - 64;
            number = number - positionUpperCase;
        } else {
            int positionLowerCase = (int) letterAfter - 96;
            number = number + positionLowerCase;
        }
        return number;
    }

    public static double modifyLetterBefore(char letterBefore, double number) {
        if (Character.isUpperCase(letterBefore)) {
            int positionUpperCase = (int) letterBefore - 64;
            number = number / positionUpperCase;
        } else {
            int positionLowerCase = (int) letterBefore - 96;
            number = number * positionLowerCase;
        }
        return number;
    }
}
