package methods.Exercises;

import java.util.Scanner;

public class vowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        vowelsCount(input);
    }

    public static void vowelsCount(String input) {
        int count = 0;
        for (char symbol : input.toLowerCase().toCharArray()) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
