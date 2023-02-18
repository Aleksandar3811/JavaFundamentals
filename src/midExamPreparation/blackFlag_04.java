package midExamPreparation;

import java.util.Scanner;

public class blackFlag_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());
        double total = 0;
        for (int i = 1; i <= days; i++) {
            total += dailyPlunder;
            if (i % 3 == 0) {
                total += 1.0 * dailyPlunder / 2;
            }
            if (i % 5 == 0) {
                total -= total * 0.3;
            }
        }
        if (total >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", total);
        } else {
            double percentage = (total / expectedPlunder) * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percentage);
        }

    }
}
