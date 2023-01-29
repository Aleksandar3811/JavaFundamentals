package arrrays.Exercise;

import java.util.Scanner;

public class commonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr1 = scanner.nextLine().split(" ");
        String[] inputArr2 = scanner.nextLine().split(" ");
        for (String s : inputArr2) {
            for (String value : inputArr1) {

                if (s.equals(value)) {
                    System.out.print(s + " ");
                }
            }
        }
    }
}
