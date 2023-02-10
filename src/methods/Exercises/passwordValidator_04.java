package methods.Exercises;

import java.util.Scanner;

public class passwordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean isInclusive = isInclusive(password);
        boolean isLetterOrDigit = isLetterOrDigit(password);
        boolean isAtLeastTwoDigit = isAtLeastTwoDigits(password);
        if (isInclusive && isLetterOrDigit && isAtLeastTwoDigit) {
            System.out.println("Password is valid");
        }

    }

    public static boolean isInclusive(String password) {
        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        } else {
            return true;
        }
    }

    public static boolean isLetterOrDigit(String password) {
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        return true;
    }

    public static boolean isAtLeastTwoDigits(String password) {
        int count = 0;
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                count++;
            }
        }
        if (count >= 2) {
            return true;
        } else {
            System.out.println("Password must have at least 2 digits");
            return false;
        }
    }

}
