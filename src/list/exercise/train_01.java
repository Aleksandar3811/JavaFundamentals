package list.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if (command.contains("Add")) {
                int passenger = Integer.parseInt(command.split(" ")[1]);
                wagons.add(passenger);
            } else {
                int passengersAdd = Integer.parseInt(command.split(" ")[0]);
                for (int index = 0; index < wagons.size(); index++) {
                    int currentWagon = wagons.get(index);
                    if (currentWagon + passengersAdd <= maxCapacity) {
                        wagons.set(index, currentWagon + passengersAdd);
                        break;
                    }
                }

            }
            command = scanner.nextLine();
        }
        for (int number : wagons) {
            System.out.print(number + " ");
        }
    }
}
