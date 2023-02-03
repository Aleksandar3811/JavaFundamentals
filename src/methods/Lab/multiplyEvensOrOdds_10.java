package methods.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class multiplyEvensOrOdds_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = Integer.parseInt(scanner.nextLine());
        System.out.println(getMultipleOfEvensAndOdds(inputNum));
    }

    public static int getMultipleOfEvensAndOdds(int n) {
        int evenSum = getEvenSum(Math.abs(n));
        int oddSum = getOddSum(Math.abs(n));
        return evenSum * oddSum;
    }

    public static int getEvenSum(int n) {
        String toString = String.valueOf(n);
        int evenSum = 0;
        int oddSum = 0;


        for (int i = 0; i < toString.length(); i++) {
            int currentNum = Integer.parseInt(String.valueOf(toString.charAt(i)));
            if (currentNum % 2 == 0) {
                evenSum += currentNum;
            } else {
                oddSum += currentNum;
            }
        }
        return evenSum;
    }

    public static int getOddSum(int n) {
        String toString = String.valueOf(n);
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < toString.length(); i++) {
            int currentNum = Integer.parseInt(String.valueOf(toString.charAt(i)));
            if (currentNum % 2 != 0) {
                oddSum += currentNum;
            } else {
                evenSum += currentNum;
            }
        }
        return oddSum;
    }
}
