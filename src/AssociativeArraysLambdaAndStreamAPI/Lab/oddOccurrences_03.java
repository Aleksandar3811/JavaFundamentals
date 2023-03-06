package AssociativeArraysLambdaAndStreamAPI.Lab;

import java.util.*;

public class oddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsArr = scanner.nextLine().split(" ");
        LinkedHashMap<String, Integer> countsMap = new LinkedHashMap<>();
        for (String item : wordsArr) {
            item = item.toLowerCase();
            countsMap.putIfAbsent(item, 0);
            countsMap.put(item, countsMap.get(item) + 1);
        }
        List<String> oddWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : countsMap.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                oddWords.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", oddWords));

    }
}
