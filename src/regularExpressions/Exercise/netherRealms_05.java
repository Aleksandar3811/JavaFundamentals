package regularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class netherRealms_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String demons = scanner.nextLine();
        Pattern pattern = Pattern.compile("[^,\\s+]+");
        Matcher matcher = pattern.matcher(demons);
        while (matcher.find()) {
            String demonName = matcher.group();
            double demonDamage = getDemonDamage(demonName);
            int demonHealth = getDemonHealth(demonName);
            System.out.printf("%s - %d health, %.2f damage%n", demonName, demonHealth, demonDamage);
        }
    }

    public static double getDemonDamage(String name) {
        String regex = "[+|-]?(\\d+\\.?\\d+|\\d+)";
        Pattern damagePattern = Pattern.compile(regex);
        Matcher damageMatcher = damagePattern.matcher(name);
        double damage = 0;
        while (damageMatcher.find()) {
            damage += Double.parseDouble(damageMatcher.group());
        }
        Pattern pattern = Pattern.compile("[*/]");
        damageMatcher = pattern.matcher(name);
        while (damageMatcher.find()) {
            String symbol = damageMatcher.group();
            if (symbol.equals("*")) {
                damage *= 2;

            } else if (symbol.equals("/")) {
                damage /= 2;
            }
        }
        return damage;
    }

    public static int getDemonHealth(String name) {
        String regex = "[^-+0-9*/.]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        int health = 0;
        while (matcher.find()) {
            int symbolAsciiCode = matcher.group().charAt(0);
            health += symbolAsciiCode;
        }
        return health;
    }
}
