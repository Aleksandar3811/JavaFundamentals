package methods.Exercises;

import java.util.Scanner;

public class topNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        printTopNumber(n);
    }

    public static void printTopNumber(int n) {
        for (int i = 1; i <= n; i++) {
            String currentNum = String.valueOf(i);
            boolean isOdd = false;
            boolean isDivisibleBy8 = false;
            int sum = 0;
            for (int j = 0; j < currentNum.length(); j++) {
                int num = Integer.parseInt(String.valueOf(currentNum.charAt(j)));
                sum += num;
                if (num % 2 != 0) {
                    isOdd = true;

                }

            }
            if (sum % 8 == 0) {
                isDivisibleBy8 = true;
            }
            if (isOdd && isDivisibleBy8) {
                System.out.println(i);
            }

        }
    }
}
