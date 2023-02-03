package methods.Lab;

import java.util.Scanner;

public class printingTriangle_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        printingTriangle(input);
    }

    public static void printingTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            printLine(1,i);
        }
        for (int i = number - 1; i >= 1; i--) {
            printLine(1,i);

        }
    }

    public static void printLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
