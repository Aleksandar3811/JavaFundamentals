package AssociativeArraysLambdaAndStreamAPI.Exercise;

import java.util.*;

public class companyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, List<String>> companies = new LinkedHashMap<>();
        while (!command.equals("End")) {
            String[] input =command.split(" -> ");
            String name = input[0];
            String id = input[1];
            if (!companies.containsKey(name)) {
                companies.put(name, new ArrayList<>());
                companies.get(name).add(id);
            } else {
                boolean checker = false;
                for (int i = 0; i < companies.get(name).size(); i++) {
                    if (companies.get(name).get(i).equals(id)) {
                        checker = true;
                        break;
                    }
                }
                if (!checker) {
                    companies.get(name).add(id);
                }
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : companies.entrySet()) {
            System.out.printf("%s%n", entry.getKey());
            for (String item : entry.getValue()) {
                System.out.printf("-- %s%n", item);
            }
        }

    }
}
