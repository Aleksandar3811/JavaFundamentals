package regularExpressions.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class starEnigma_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanet = new ArrayList<>();
        String regex = "@(?<planetName>[A-ZZa-z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<attackType>[AD])![^@!:>-]*->(?<soldiersCount>[0-9]+)";
        Pattern pattern = Pattern.compile(regex);
        int attacked = 0;
        int destroyed = 0;
        for (int i = 1; i <= n; i++) {
            String messages = scanner.nextLine();
            char[] charArr = messages.toCharArray();
            int countSymbols = getCharCount(charArr);
            String newText = "";
            for (int j = 0; j < charArr.length; j++) {
                char newSymbol = (char) (charArr[j] - countSymbols);
                charArr[j] = newSymbol;
                newText += charArr[j];
            }
            Matcher matcher = pattern.matcher(newText);
            String name = "";
            String types = "";
            if (matcher.find()) {
                name = matcher.group("planetName");
                types = matcher.group("attackType");
            }
            if (types.equals("D")) {
                destroyed++;
                destroyedPlanet.add(name);

            } else if (types.equals("A")) {
                attacked++;
                attackedPlanets.add(name);
            }

        }
        Collections.sort(attackedPlanets);
        System.out.println("Attacked planets: " + attacked);
        attackedPlanets.forEach((key) -> System.out.println("-> " + key));
//        for (int i = 0; i < attackedPlanets.size(); i++) {
//            System.out.println("-> " + attackedPlanets.get(i));
//        }
        Collections.sort(destroyedPlanet);
        System.out.println("Destroyed planets: " + destroyed);
        destroyedPlanet.forEach((key) -> System.out.println("-> " + key));
//        for (int i = 0; i < destroyedPlanet.size(); i++) {
//            System.out.println("-> " + destroyedPlanet.get(i));
//        }
    }

    private static int getCharCount(char[] chars) {
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'S' || chars[i] == 's' || chars[i] == 'T' || chars[i] == 't' || chars[i] == 'A'
                    || chars[i] == 'R' || chars[i] == 'r') {
                count++;
            }
        }
        return count;
    }
}
