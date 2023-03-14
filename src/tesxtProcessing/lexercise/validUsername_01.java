package tesxtProcessing.lexercise;

import java.util.Scanner;

public class validUsername_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] userName = scanner.nextLine().split(", ");
        for (String name : userName) {
            if (isValid(name)) {

                System.out.println(name);
            }
        }

    }

    public static boolean isValid(String name) {
        if (name.length() < 3 || name.length() > 16) {
            return false;
        }
        for (char symbol : name.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol != '_') {
                return false;
            }
        }
        return true;

    }
}
