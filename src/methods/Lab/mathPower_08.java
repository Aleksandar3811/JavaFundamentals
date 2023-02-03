package methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathPower_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputNum = Double.parseDouble(scanner.nextLine());
        int powerInput = Integer.parseInt(scanner.nextLine());
        System.out.println(new DecimalFormat("0.####").format(mathPower(inputNum, powerInput)));
    }

    public static double mathPower(double number, int power) {
        double result = Math.pow(number, power);
        return result;
    }
}
