package methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathOperations_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        int number2 = Integer.parseInt(scanner.nextLine());
        double result = calculate(number1, operator, number2);
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(result));
    }

    public static double calculate(int a, String operator, int b) {
        double result = 0.0;
        switch (operator) {
            case "/":
                result = 1.0 * a / b;
                break;
            case "*":
                result = a * b;
                break;
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
        }
        return result;
    }
}
