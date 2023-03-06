package AssociativeArraysLambdaAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class aMinerTask_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        LinkedHashMap<String, Integer> resources = new LinkedHashMap<>();

        while (!command.equals("stop")) {
            String resource = command;
            int quantity = Integer.parseInt(scanner.nextLine());
            if (resources.containsKey(resource)) {
                resources.put(resource, resources.get(resource) + quantity);
            } else {
                resources.put(resource, quantity);
            }

            command = scanner.nextLine();
        }
        resources.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
