package tesxtProcessing.lab;

import java.util.Scanner;

public class substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String input2 = scanner.nextLine();
        while (input2.contains(input)) {
            input2 = input2.replace(input, "");

        }
        System.out.println(input2);
    }
}
