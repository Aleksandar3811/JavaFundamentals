package methods.Lab;

import java.util.Scanner;

public class calculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int widthInput = Integer.parseInt(scanner.nextLine());
        int lengthInput = Integer.parseInt(scanner.nextLine());
        int area = calculateRectangleArea(widthInput, lengthInput);
        System.out.println(area);
    }

    public static int calculateRectangleArea(int width, int length) {
        return width * length;
    }
}
