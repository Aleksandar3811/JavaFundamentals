package AssociativeArraysLambdaAndStreamAPI.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class legendaryFarming_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);
        Map<String, Integer> junks = new LinkedHashMap<>();
        boolean isWin = false;
        while (!isWin) {
            String[] input = scanner.nextLine().split("\\s+");
            for (int index = 0; index < input.length; index += 2) {
                int quantity = Integer.parseInt(input[index]);
                String material = input[index + 1].toLowerCase();
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = materials.get(material);
                    materials.put(material, currentQuantity + quantity);

                } else {

                   if (!junks.containsKey(material)){
                       junks.put(material,quantity);
                   }
                   else {

                       junks.put(material,junks.get(material)+quantity);
                   }
                }

                if (materials.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    materials.put("shards", materials.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (materials.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materials.put("fragments", materials.get("fragments") - 250);
                    isWin = true;
                    break;
                } else if (materials.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    materials.put("motes", materials.get("motes") - 250);
                    isWin = true;
                    break;
                }
            }
            if (isWin) {
                break;
            }

        }
        materials.forEach((key, value) -> System.out.println(key + ": " + value));
        junks.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
