package objectsAndClasses.Exercise;

import java.util.Random;
import java.util.Scanner;

public class advertisementMessage_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] phrases = {"Excellent Product.", "Such a great Product.", "I always use that Product.", "Best Product of its category.", "Exceptional Product.", "I can’t live without this Product."};
        String[] events = {"Now I feel good.", "I have succeeded with this Product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= count; i++) {
            String currentPhrases = getRandomWord(phrases);
            String currentEvents = getRandomWord(events);
            String currentAuthor = getRandomWord(authors);
            String currentCities = getRandomWord(cities);
            System.out.printf("%s %s %s - %s%n", currentPhrases, currentEvents, currentAuthor, currentCities);

        }
    }

    public static String getRandomWord(String[] words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        return words[randomIndex];
    }
}
