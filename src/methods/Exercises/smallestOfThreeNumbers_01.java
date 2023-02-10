package methods.Exercises;

import java.util.Scanner;

public class smallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        smallestNumber(num1, num2, num3);
    }

    public static void smallestNumber(int n1, int n2, int n3) {
        int smallestNum = 0;
        if (n1 < n2 && n1 < n3) {
            smallestNum = n1;
        } else if (n2 < n1 && n2 < n3) {
            smallestNum = n2;
        } else {
            smallestNum = n3;
        }
        System.out.println(smallestNum);
    }
}
