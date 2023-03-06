package AssociativeArraysLambdaAndStreamAPI.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class wordFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = Arrays.stream(scanner.nextLine().split(" "))
                .filter(w -> w.length() % 2 == 0).toArray(String[]::new);
        System.out.println(String.join("\n", words));
    }
}
