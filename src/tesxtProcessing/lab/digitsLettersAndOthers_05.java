package tesxtProcessing.lab;

import java.util.Scanner;

public class digitsLettersAndOthers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder digitBf = new StringBuilder();
        StringBuilder letterBf = new StringBuilder();
        StringBuilder otherBf = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (Character.isDigit(symbol)) {
                digitBf.append(symbol);
            } else if (Character.isLetter(symbol)) {
                letterBf.append(symbol);
            } else {
                otherBf.append(symbol);
            }
        }
        System.out.println(digitBf);
        System.out.println(letterBf);
        System.out.println(otherBf);
    }
}
