package midExamPreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class treasureHunt_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> initialLoot = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")) {
            if (command.contains("Loot")) {
                List<String> loots = Arrays.stream(command.split(" "))
                        .collect(Collectors.toList());
                List<String> lootsSubLisT = loots.subList(1, loots.size());
                for (String item : lootsSubLisT) {
                    if (!initialLoot.contains(item)) {
                        initialLoot.add(0, item);
                    }
                }
            } else if (command.contains("Drop")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                if (index >= 0 && index < initialLoot.size()) {
                    String removedItem = initialLoot.get(index);
                    initialLoot.remove(index);
                    initialLoot.add(removedItem);
                }
            } else if (command.contains("Steal")) {
                int count = Integer.parseInt(command.split(" ")[1]);
                List<String> stolenItems = new ArrayList<>();
                if(count>initialLoot.size()){
                    for (int i =0; i < initialLoot.size(); i++) {
                        stolenItems.add(initialLoot.get(i));
                        initialLoot.remove(initialLoot.get(i));
                        i--;
                    }
                }else {
                    for (int i = initialLoot.size() - count; i < initialLoot.size(); i++) {
                        stolenItems.add(initialLoot.get(i));
                        initialLoot.remove(initialLoot.get(i));
                        i--;
                    }
                }
                System.out.println(String.join(", ", stolenItems));

            }

            command = scanner.nextLine();
        }
        if (initialLoot.size() == 0) {
            System.out.println("Failed treasure hunt.");
        } else {
            double treasureGain = 0;
            int countDivide = 0;
            for (String item : initialLoot) {
                countDivide++;
                treasureGain += item.length();
            }
            double total = treasureGain / countDivide;
            System.out.printf("Average treasure gain: %.2f pirate credits.", total);
        }


    }
}
