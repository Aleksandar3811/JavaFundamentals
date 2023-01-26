package arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstIntArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] secondIntArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        int diffIndex = -1;
        boolean isDifferent = true;
        for (int i = 0; i < firstIntArr.length; i++) {
            int firstNum = firstIntArr[i];
            int secondNum = secondIntArr[i];
            if (firstNum == secondNum) {
                sum += firstNum;

            } else {
                isDifferent = false;
                diffIndex = i;
                break;
            }


        }
        if (isDifferent) {
            System.out.printf("Arrays are identical. Sum: %d", sum);

        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", diffIndex);
        }
    }
}
