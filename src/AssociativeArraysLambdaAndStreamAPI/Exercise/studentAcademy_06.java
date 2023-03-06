package AssociativeArraysLambdaAndStreamAPI.Exercise;

import java.util.*;

public class studentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, List<Double>> studentMap = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            studentMap.putIfAbsent(studentName, new ArrayList<>());
            studentMap.get(studentName).add(grade);

        }
        LinkedHashMap<String, Double> studentsAvg = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : studentMap.entrySet()) {
            double sum = getAvg(entry.getValue());
            if (sum >= 4.50) {
                studentsAvg.put(entry.getKey(), sum);
            }
        }
        studentsAvg.forEach((key, value) -> System.out.printf("%s -> %.2f%n", key, value));

    }

    public static double getAvg(List<Double> grades) {
        double sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return sum / grades.size();
    }
}
