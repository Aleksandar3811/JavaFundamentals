package methods.Exercises;

import java.util.Scanner;

public class factorialDivision_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        long factorial1 = calculateFactorial(n1);
        long factorial2 = calculateFactorial(n2);
        double sum = 1.0 * factorial1 / factorial2;
        System.out.printf("%.2f", sum);
    }

    public static long calculateFactorial(int number) {
        long sum = 1;
        for (int i = 1; i <= number; i++) {
            sum *= i;
        }
        return sum;
    }
}
