package list.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class gaussTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).
                collect(Collectors.toList());
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.size() == 1) {
                System.out.print(numbers.get(i));
                break;
            }
            int sum = numbers.get(i) + numbers.get(numbers.size() - 1);
            numbers.remove(i);
            numbers.remove(numbers.size() - 1);
            System.out.print(sum + " ");
            i = -1;
        }
    }
}
