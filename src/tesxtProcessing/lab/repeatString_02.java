package tesxtProcessing.lab;

import java.util.Scanner;

public class repeatString_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        StringBuilder bf = new StringBuilder();
        for (String word : words) {
            int length = word.length();
            bf.append(repeatedString(length, word));
        }
        System.out.println(bf);
    }

    public static StringBuilder repeatedString(int n, String word) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(word);
        }
        return result;
    }
}
