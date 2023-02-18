package midExamPreparation;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class theLift_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waitingPeople = Integer.parseInt(scanner.nextLine());
        List<Integer> peopleOnLift = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        boolean isEmpty = false;
        for (int i = 0; i < peopleOnLift.size(); i++) {
            if (isEmpty) {
                break;
            }
            if (peopleOnLift.get(i) == 4) {
                break;
            } else {
                while (peopleOnLift.get(i) != 4) {
                    if (waitingPeople == 0) {
                        isEmpty = true;
                        break;
                    }

                    peopleOnLift.set(i, peopleOnLift.get(i) + 1);
                    waitingPeople--;
                }
            }
        }
        boolean isFull = true;
        for (int num : peopleOnLift) {
            if (num != 4) {
                isFull = false;
            }
        }
        if (!isFull) {
            System.out.println("The lift has empty spots!");
            for (int num : peopleOnLift) {
                System.out.print(num + " ");
            }
        } else if (waitingPeople > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n",waitingPeople);
            for (int num : peopleOnLift) {
                System.out.print(num + " ");
            }
        } else if (waitingPeople == 0 && isFull) {
            for (int num : peopleOnLift) {
                System.out.print(num + " ");
            }
        }
    }
}
