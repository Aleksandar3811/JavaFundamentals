package midExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> priceRatings = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int entryPoint = Integer.parseInt(scanner.nextLine());
        String typeItem = scanner.nextLine();
        List<Integer> leftItems = new ArrayList<>();
        List<Integer> rightItems = new ArrayList<>();
        for (int i = 0; i < entryPoint; i++) {
            leftItems.add(priceRatings.get(i));
        }
        for (int i = priceRatings.size() - 1; i > entryPoint; i--) {
            rightItems.add(priceRatings.get(i));
        }
        if (typeItem.equals("cheap")) {
            for (int i = 0; i < leftItems.size(); i++) {
                int currentNum = priceRatings.get(entryPoint);
                if (leftItems.get(i) >= currentNum) {
                    leftItems.remove(i);
                    i--;
                }
            }
            for (int i = 0; i < rightItems.size(); i++) {
                int currentNum = priceRatings.get(entryPoint);
                if (rightItems.get(i) >= currentNum) {
                    rightItems.remove(i);
                    i--;
                }
            }
        } else if (typeItem.equals("expensive")) {
            for (int i = 0; i < leftItems.size(); i++) {
                int currentNum = priceRatings.get(entryPoint);
                if (leftItems.get(i) < currentNum) {
                    leftItems.remove(i);
                    i--;
                }
            }
            for (int i = 0; i < rightItems.size(); i++) {
                int currentNum = priceRatings.get(entryPoint);
                if (rightItems.get(i) < currentNum) {
                    rightItems.remove(i);
                    i--;
                }
            }
        }
        int leftSum = 0;
        int rightSum = 0;
        for (int num : leftItems) {
            leftSum += num;
        }
        for (int num : rightItems) {
            rightSum += num;
        }
        if (leftSum >= rightSum) {
            System.out.printf("Left - %d", leftSum);
        } else {
            System.out.printf("Right - %d", rightSum);
        }


    }
}
