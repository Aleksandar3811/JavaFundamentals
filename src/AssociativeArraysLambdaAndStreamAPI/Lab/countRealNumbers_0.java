package AssociativeArraysLambdaAndStreamAPI.Lab;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class countRealNumbers_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numsArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();
        TreeMap<Double, Integer> countsMap = new TreeMap<>();
        for (double num : numsArr) {
            countsMap.putIfAbsent(num,0);
            int value = countsMap.get(num);
              countsMap.put(num, value + 1);
//            if (!countsMap.containsKey(num)) {
//
//                countsMap.put(num, 1);
//            } else {
//                int value = countsMap.get(num);
//                countsMap.put(num, value + 1);
//            }
        }
        for (Map.Entry<Double, Integer> entry : countsMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
