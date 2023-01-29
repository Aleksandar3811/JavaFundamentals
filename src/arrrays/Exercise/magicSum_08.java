package arrrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class magicSum_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberArr.length; i++) {
            int currentNum = numberArr[i];
            for (int j = i + 1; j < numberArr.length; j++) {
                int secondNum = numberArr[j];
                if (currentNum + secondNum == n) {
                    System.out.println(currentNum + " " + secondNum);
                }
            }
        }
    }
}
