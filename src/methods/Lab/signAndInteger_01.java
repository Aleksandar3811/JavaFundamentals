package methods.Lab;

import java.util.Scanner;

public class signAndInteger_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numInput = Integer.parseInt(scanner.nextLine());
        printNumberSign(numInput);
    }

    public static void printNumberSign(int num) {
        String signWord = "";
        if (num < 0) {
            signWord = "negative";
        } else if (num > 0) {
            signWord = "positive";
        } else {
            signWord = "zero";
        }
        System.out.printf("The number %d is %s.%n", num, signWord);
    }
}
