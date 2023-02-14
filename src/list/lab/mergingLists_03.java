package list.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class mergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).
                collect(Collectors.toList());

        List<Integer> numbers2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).
                collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();
        int minSize = Math.min(numbers1.size(), numbers2.size());
        for (int i = 0; i < minSize; i++) {
            int firstNum = numbers1.get(i);
            int secondNum = numbers2.get(i);
            result.add(firstNum);
            result.add(secondNum);
        }
        if (numbers1.size() > numbers2.size()) {
            result.addAll(numbers1.subList(minSize, numbers1.size()));

        } else {
            result.addAll(numbers2.subList(minSize, numbers2.size()));
        }
        System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
    }
}
