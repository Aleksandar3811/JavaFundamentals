package list.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class changeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String commands = scanner.nextLine();
        while (!commands.equals("end")) {
            if (commands.contains("Delete")) {
                int element = Integer.parseInt(commands.split(" ")[1]);
                numbers.removeIf(number -> number == element);
            } else {
                int element = Integer.parseInt(commands.split(" ")[1]);
                int position = Integer.parseInt(commands.split(" ")[2]);
                numbers.add(position, element);
            }
            commands = scanner.nextLine();
        }
        System.out.println(numbers.toString()
                .replace(",", "")
                .replace("[", "")
                .replace("]", ""));
    }
}
