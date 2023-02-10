package methods.Exercises;

import java.util.Scanner;

public class addAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int sum = summing(n1, n2);
        System.out.println(subtracting(n3, sum));
    }

    public static int summing(int n1, int n2) {
        return n1 + n2;
    }

    public static int subtracting(int n1, int n2) {
        return n2 - n1;
    }
}
