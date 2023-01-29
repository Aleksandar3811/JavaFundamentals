package arrrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class arrayModifier_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if (command.contains("swap")) {
                int first = Integer.parseInt(command.split(" ")[1]);
                int second = Integer.parseInt(command.split(" ")[2]);
                int element1 = numberArr[first];
                int element2 = numberArr[second];
                numberArr[first] = element2;
                numberArr[second] = element1;
            } else if (command.contains("multiply")) {
                int first = Integer.parseInt(command.split(" ")[1]);
                int second = Integer.parseInt(command.split(" ")[2]);
                int sum = numberArr[first] * numberArr[second];
                numberArr[first] = sum;
            } else if (command.contains("decrease")) {
                for (int i = 0; i < numberArr.length; i++) {
                    numberArr[i] -= 1;
                }
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < numberArr.length-1; i++) {
            System.out.print(numberArr[i] + ", ");
        }
        System.out.print(numberArr[numberArr.length-1]);
    }
}
