package methods.Lab;

import java.util.Scanner;

public class calculations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        if (input.equals("add")) {
            addingNumbers(num1, num2);
        } else if (input.equals("multiply")) {
            multiplyNumber(num1, num2);
        } else if (input.equals("subtract")) {
            subtractNumbers(num1, num2);
        } else if (input.equals("divide")) {
            divideNumber(num1, num2);
        }
    }

    public static void addingNumbers(int number1, int number2) {
        System.out.println(number1 + number2);
    }

    public static void multiplyNumber(int number1, int number2) {
        System.out.println(number1 * number2);
    }

    public static void subtractNumbers(int number1, int number2) {
        System.out.println(number1 - number2);
    }

    public static void divideNumber(int number1, int number2) {
        System.out.println(number1 / number2);
    }
}
