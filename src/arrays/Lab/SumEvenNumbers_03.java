package arrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        String[] inputArr = input.split(" ");
//        int[] numberArr = new int[inputArr.length];
//        for (int i = 0; i < numberArr.length; i++) {
//            numberArr[i] = Integer.parseInt(inputArr[i]);
//        }
        int[] numberArr= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt( Integer::parseInt)
                .toArray();
        int sum = 0;
//        for (int i = 0; i < numberArr.length; i++) {
//            if (numberArr[i] % 2 == 0) {
//                sum += numberArr[i];
//
//            }
//        }
        for (int j : numberArr) {
            if (j % 2 == 0) {
                sum += j;

            }
        }
        System.out.println(sum);
    }
}
