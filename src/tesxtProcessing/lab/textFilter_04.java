package tesxtProcessing.lab;

import java.util.Scanner;

public class textFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] banWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        for (String banWord : banWordsArr) {
            String asterisk = String.valueOf(repeatedString(banWord.length()));
            text = text.replace(banWord, asterisk);

        }
        System.out.println(text);
    }

    public static StringBuilder repeatedString(int n) {
        StringBuilder bf = new StringBuilder();
        for (int i = 0; i < n; i++) {
            bf.append("*");
        }
        return bf;
    }
}
