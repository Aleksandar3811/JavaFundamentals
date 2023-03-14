package bitwiseOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class binaryDigitsCount_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        char digit = scanner.nextLine().charAt(0);
        String numCounts = " ";
        numCounts = Integer.toBinaryString(number);
        int count = 0;
        for (int i = 0; i < numCounts.length(); i++) {
            if (digit==(numCounts.charAt(i))) {
                count++;
            }
        }

        System.out.println(count);
        ;
    }
}
