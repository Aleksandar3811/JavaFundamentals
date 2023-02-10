package methods.Exercises;

import java.util.Scanner;

public class middleCharacters_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printMiddleCharacter(input);
    }

    public static void printMiddleCharacter(String input) {
        if (input.length() % 2 == 0) {
            char currentDigit1 = input.charAt(input.length() / 2);
            char currentDigit2 = input.charAt(input.length() / 2 - 1);
            System.out.printf("%c%c", currentDigit2, currentDigit1);
        } else {
            System.out.println(input.charAt(input.length() / 2));
        }
    }
}
