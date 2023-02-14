package list.lab;

import java.util.*;
import java.util.stream.Collectors;

public class removeNegativeAndReverse_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).
                collect(Collectors.toList());
        numbers.removeIf(number -> number < 0);
        Collections.reverse(numbers);
        if (numbers.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println(numbers.toString()
                    .replace(",", "")
                    .replace("[", "")
                    .replace("]", ""));
        }
    }
}
