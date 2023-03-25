package examPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class p02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        long coolThreshold = 1;
        for (char symbol : text.toCharArray()) {
            if (Character.isDigit(symbol)) {
                long num = Long.parseLong(symbol + "");
                coolThreshold *= num;

            }
        }
        String regex = "([:]{2}|[*]{2})(?<emoji>[A-Z][a-z]{2,})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        List<String> emojis = new ArrayList<>();
        while (matcher.find()) {
            count++;
            String emoji = matcher.group("emoji");
            long coolness = 0;
            for (char letter : emoji.toCharArray()) {
                coolness += (int) letter;
            }
            if (coolness > coolThreshold) {
                emojis.add(matcher.group());
            }
        }
        System.out.println("Cool threshold: " + coolThreshold);
        System.out.println(count + " emojis found in the text. The cool ones are:");
        emojis.forEach(System.out::println);

    }
}
