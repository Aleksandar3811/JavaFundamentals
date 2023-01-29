package arrrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class equalSums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int theNumber = 0;
        for (int index = 0; index < numberArr.length; index++) {
            int currentNum = numberArr[index];
            int leftSum = 0;
            int rightSum = 0;

            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += numberArr[leftIndex];

            }
            for (int rightIndex = index + 1; rightIndex < numberArr.length; rightIndex++) {
                rightSum += numberArr[rightIndex];
            }
            if (leftSum == rightSum) {
                System.out.println(index);
                return;
            }

        }
        System.out.println("no");

    }
}
