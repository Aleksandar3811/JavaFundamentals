package list.lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class sumAdjacentEqualNumbers_01 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).
                collect(Collectors.toList());
        for (int i = 0; i < numbers.size(); i++) {
            if (i + 1 == numbers.size()) {
                break;
            }
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                numbers.set(i, (numbers.get(i) + numbers.get(i + 1)));
                numbers.remove(i + 1);
                i = -1;
            }
        }
        String output = joinElementByDelimiter(numbers);
        System.out.println(output);
    }

    private static String joinElementByDelimiter(List<Double> numbers) {
        String output = " ";
        for (Double number : numbers) {
            output += (new DecimalFormat("0.#").format(number) + " ");
        }
        return output;
    }
}

