package AssociativeArraysLambdaAndStreamAPI.Exercise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class countCharsInAString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        LinkedHashMap<Character, Integer> charsCount = new LinkedHashMap<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                char currentChar = words[i].charAt(j);
                charsCount.putIfAbsent(currentChar, 0);
                charsCount.put(currentChar, charsCount.get(currentChar) + 1);
            }
        }
        charsCount.forEach((key, value) -> System.out.println(key + " -> " + value));

    }
}
