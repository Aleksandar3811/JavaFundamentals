package midExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            int value = Integer.parseInt(command.split("\\s+")[1]);
            if (command.contains("Add")) {
                numbers.add(value);
            } else if (command.contains("Remove")) {
                if (numbers.contains(value)){

                    numbers.remove(Integer.valueOf(value));
                }
            } else if (command.contains("Replace")) {
                int replacement = Integer.parseInt(command.split("\\s+")[2]);
                for (int i = 0; i < numbers.size(); i++) {
                    int currentNum = numbers.get(i);
                    if (currentNum == value) {
                        numbers.set(numbers.indexOf(currentNum), replacement);
                        break;
                    }
                }
            } else if (command.contains("Collapse")) {
                for (int i = 0; i < numbers.size(); i++) {
                    if (numbers.get(i) <value) {
                        numbers.remove(numbers.get(i));
                    }
                }
            }

            command = scanner.nextLine();
        }
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
