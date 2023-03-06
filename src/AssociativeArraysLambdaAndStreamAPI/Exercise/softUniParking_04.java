package AssociativeArraysLambdaAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class softUniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String, String> usersList = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String[] command = scanner.nextLine().split(" ");
            String currentCommand = command[0];
            String name = command[1];
            String plate = "";
            if (command.length > 2) {
                plate = command[2];
            }
            switch (currentCommand) {
                case "register":
                    if (!usersList.containsKey(name)) {
                        usersList.put(name, plate);
                        System.out.printf("%s registered %s successfully%n", name, plate);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", plate);
                    }
                    break;
                case "unregister":
                    if (!usersList.containsKey(name)) {
                        System.out.printf("ERROR: user %s not found%n", name);
                    } else {
                        usersList.remove(name);
                        System.out.printf("%s unregistered successfully%n", name);
                    }
                    break;
            }
        }
        usersList.forEach((key, value) -> System.out.printf("%s => %s%n", key, value));
    }
}
