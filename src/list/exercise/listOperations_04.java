package list.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            if (command.contains("Add")) {
                int num = Integer.parseInt(command.split(" ")[1]);
                numbers.add(num);
            } else if (command.contains("Insert")) {
                int num = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                if (index >= 0 && index <= numbers.size() - 1) {
                    numbers.add(index, num);
                } else {
                    System.out.println("Invalid index");

                }
            } else if (command.contains("Remove")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                if (index >= 0 && index <= numbers.size() - 1) {

                    numbers.remove(index);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command.contains("left")) {
                int countShifts = Integer.parseInt(command.split(" ")[2]);
                for (int i = 1; i <= countShifts; i++) {
                    int firstNum = numbers.get(0);
                    numbers.remove(Integer.valueOf(firstNum));
                    numbers.add(Integer.valueOf(firstNum));
                }

            } else if (command.contains("right")) {
                int countShifts = Integer.parseInt(command.split(" ")[2]);
                for (int i = 1; i <= countShifts; i++) {
                    int lastNum = numbers.get(numbers.size() - 1);
                    numbers.add(0, lastNum);
                    numbers.remove(numbers.size() - 1);
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(numbers.toString()
                .replace(",", "")
                .replace("[", "")
                .replace("]", ""));
    }
}
