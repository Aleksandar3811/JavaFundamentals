package midExamPreparation;

import java.util.Scanner;

public class counterStrike_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialEnergy = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int countWins = 0;
        boolean isEnoughEnergy = true;
        while (!input.equals("End of battle")) {
            int distance = Integer.parseInt(input);

            if (initialEnergy - distance < 0) {

                isEnoughEnergy = false;
                break;
            } else {
                initialEnergy -= distance;
                countWins++;

            }
            if (countWins % 3 == 0) {
                initialEnergy += countWins;
            }

            input = scanner.nextLine();
        }
        if (isEnoughEnergy) {
            System.out.printf("Won battles: %d. Energy left: %d%n", countWins, initialEnergy);
        } else {
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n%n", countWins, initialEnergy);
        }

    }
}
