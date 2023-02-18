package midExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class numbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double averageNum = 1.0 * sum / numbers.size();
        List<Integer> topNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num > averageNum) {
                topNumbers.add(num);
            }
        }
        Collections.sort(topNumbers);
        if (topNumbers.size() > 5) {
            List<Integer> topNums = topNumbers.subList(topNumbers.size() - 5, topNumbers.size());
            Collections.reverse(topNums);
            System.out.println(topNums.toString()
                    .replace("[", "")
                    .replace("]", "")
                    .replace(",", ""));
        } else if (topNumbers.size() == 0) {
            System.out.println("No");
        } else {
            Collections.reverse(topNumbers);
            for (int num : topNumbers) {
                System.out.print(num + " ");
            }
        }
    }
}
