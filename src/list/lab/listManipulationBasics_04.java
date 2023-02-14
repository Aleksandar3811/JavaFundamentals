package list.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).
                collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if (command.contains("Add")) {
                int numberAdd = Integer.parseInt(command.split(" ")[1]);
                numbers.add(numberAdd);

            } else if (command.contains("RemoveAt")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(index);

            } else if (command.contains("Remove")) {
                int n = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(Integer.valueOf(n));
            } else if (command.contains("Insert")) {
                String[] commandsPart = command.split(" ");
                int num = Integer.parseInt(commandsPart[1]);
                int index = Integer.parseInt(commandsPart[2]);
                numbers.add(index, num);
            }

            command = scanner.nextLine();
        }

        System.out.println(numbers.toString()
                .replace(",", "")
                .replace("[", "")
                .replace("]", ""));
    }
}
