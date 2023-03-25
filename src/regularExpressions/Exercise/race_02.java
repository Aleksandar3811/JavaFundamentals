package regularExpressions.Exercise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class race_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> participants = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());
        String input = scanner.nextLine();
        LinkedHashMap<String, Integer> participantsResult = new LinkedHashMap<>();

        while (!input.equals("end of race")) {
            String regex1 = "[A-Za-z]";
            Pattern pattern = Pattern.compile(regex1);
            Matcher matcher = pattern.matcher(input);
            StringBuilder st = new StringBuilder();
            while (matcher.find()) {
                st.append(matcher.group());

            }
            String regex2 = "[0-9]";
            Pattern pattern2 = Pattern.compile(regex2);
            Matcher matcher2 = pattern2.matcher(input);
            int km = 0;
            while (matcher2.find()) {
                km += Integer.parseInt(matcher2.group());
            }
            for (String person : participants) {
                if (person.equals(st.toString())) {
                    participantsResult.put(person, 0);
                    participantsResult.put(person, participantsResult.get(person) + km);

                }
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i <= 2; i++) {
            String recer = participants.get(i);
            if (i == 0) {
                System.out.println("1st place: " + recer);
            } else if (i == 1) {
                System.out.println("2nd place: " + recer);
            } else if (i == 2) {
                System.out.println("3rd place: " + recer);
            }
        }
    }
}
