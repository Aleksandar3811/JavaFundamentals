package AssociativeArraysLambdaAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class softUniExamResult_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> countsMap = new LinkedHashMap<>();
        Map<String, Integer> pointsMap = new LinkedHashMap<>();
        while (!input.equals("exam finished")) {
            String[] command = input.split("-");
            if (command.length > 2) {
                String name = command[0];
                String language = command[1];
                int points = Integer.parseInt(command[2]);
                pointsMap.putIfAbsent(name, points);
                countsMap.putIfAbsent(language, 0);
                if (countsMap.containsKey(language)) {
                    countsMap.put(language, countsMap.get(language) + 1);
                }
                if (pointsMap.containsKey(name) && pointsMap.get(name) < points) {

                    pointsMap.put(name, points);
                }
            } else {
                String name = command[0];
                pointsMap.remove(name);
            }

            input = scanner.nextLine();
        }
        System.out.println("Results:");
        pointsMap.forEach((key, value) -> System.out.println(key + " | " + value));
        System.out.println("Submissions:");
        countsMap.forEach((key, value) -> System.out.println(key + " - " + value));

    }
}
