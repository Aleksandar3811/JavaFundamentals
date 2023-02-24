package midExam;

import java.util.Scanner;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int signedStudent = Integer.parseInt(scanner.nextLine());
        double priceFlour = Double.parseDouble(scanner.nextLine());
        double priceEgg = Double.parseDouble(scanner.nextLine());
        double priceApron = Double.parseDouble(scanner.nextLine());
        int countFlour = 0;
        for (int i = 1; i <= signedStudent; i++) {
            countFlour++;
            if (i % 5 == 0) {
                countFlour--;
            }
        }
        double countApron = Math.ceil(signedStudent+(signedStudent * 0.2));
        int countEggs = signedStudent * 10;
        double allFlour = countFlour * priceFlour;
        double allEggs = priceEgg * countEggs;
        double allApron = priceApron * countApron;
        double sum = allApron + allEggs + allFlour;
        if (sum <= budget) {
            System.out.printf("Items purchased for %.2f$.", sum);
        } else {
            System.out.printf("%.2f$ more needed.", sum - budget);
        }


    }
}
