package midExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class memoryGame_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> elements = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        int countMoves = 0;
        while (!input.equals("end")) {
            int index1 = Integer.parseInt(input.split(" ")[0]);
            int index2 = Integer.parseInt(input.split(" ")[1]);
            countMoves++;
            if (index1 == index2 || !(index1 >= 0 && index1 < elements.size()) || !(index2 >= 0 && index2 < elements.size())) {
                String elementAdd = "-" + String.valueOf(countMoves) + "a";
                elements.add(elements.size() / 2, elementAdd);
                elements.add(elements.size() / 2, elementAdd);
                System.out.println("Invalid input! Adding additional elements to the board");

            } else {
                String firstElement = elements.get(index1);
                String secondElement = elements.get(index2);
                if (firstElement.equals(secondElement)) {
                    elements.remove(firstElement);
                    elements.remove(secondElement);
                    System.out.printf("Congrats! You have found matching elements - %s!\n", firstElement);

                } else {
                    System.out.println("Try again!");
                }
            }
            if (elements.size() == 0) {
                System.out.printf("You have won in %d turns!\n", countMoves);
                break;
            }
            input = scanner.nextLine();
        }
        if (elements.size() != 0) {
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ", elements));
        }
    }
}
