package methods.Lab;

import java.util.Scanner;

public class repeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        String result = repeating(input, n);
        System.out.println(result);
    }

    public static String repeating(String str, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + str;
        }
        return result;
    }
}
