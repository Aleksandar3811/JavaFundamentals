package DataTypesAndVariables.exercise;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int allWater = 0;
        for (int i = 1; i <= n; i++) {
            int water = Integer.parseInt(scanner.nextLine());
            allWater += water;

            if (allWater > 255) {
                System.out.println("Insufficient capacity!");
                allWater -= water;
            }
        }
        System.out.println(allWater);
    }

}
