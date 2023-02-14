package list.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class softUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> schedule = Arrays.stream(scanner.nextLine().split(", ")).
                collect(Collectors.toList());
        String commands = scanner.nextLine();
        while (!commands.equals("course start")) {
            List<String> command = Arrays.stream(commands.split(":"))
                    .collect(Collectors.toList());
            String lessonTitle = command.get(1);
            if (commands.contains("Add")) {
                if (!schedule.contains(lessonTitle)) {
                    schedule.add(lessonTitle);
                }
            } else if (commands.contains("Insert")) {
                int index = Integer.parseInt(command.get(2));
                if (!schedule.contains(lessonTitle)) {
                    schedule.add(index, lessonTitle);
                }
            } else if (commands.contains("Remove")) {
                if (schedule.contains(lessonTitle)) {
                    schedule.remove(lessonTitle);
                }
                int indexLesson = schedule.indexOf(lessonTitle);
                if (schedule.get(indexLesson + 1).equals(lessonTitle + "-Exercise")) {
                    schedule.remove(indexLesson + 1);
                }
            } else if (commands.contains("Swap")) {
                String lessonTitle2 = command.get(2);
                if (schedule.contains(lessonTitle) && schedule.contains(lessonTitle2)) {
                    int index1 = schedule.indexOf(lessonTitle);
                    int index2 = schedule.indexOf(lessonTitle2);
                    schedule.set(index1, lessonTitle2);
                    schedule.set(index2, lessonTitle);
                    String exOne = lessonTitle + "-Exercise";
                    String exTwo = lessonTitle2 + "-Exercise";
                    if (schedule.contains(exOne)) {
                        schedule.remove(schedule.indexOf(exOne));
                        schedule.add(schedule.indexOf(lessonTitle + 1), exOne);
                    }
                    if (schedule.contains(exTwo)) {
                        schedule.remove(schedule.indexOf(exTwo));
                        schedule.add(schedule.indexOf(lessonTitle2) + 1, exTwo);
                    }
                }
            } else if (commands.contains("Exercise")) {
                String exercise = lessonTitle + "-Exercise";
                int indexLessonTitle = schedule.indexOf(lessonTitle);
                if (schedule.contains(lessonTitle)) {
                    if (indexLessonTitle == schedule.size() - 1) {
                        schedule.add(indexLessonTitle + 1, exercise);

                    } else if (!schedule.get(indexLessonTitle + 1).equals(exercise)) {
                        schedule.add(indexLessonTitle + 1, exercise);
                    }
                } else {
                    schedule.add(lessonTitle);
                    schedule.add(exercise);
                }

            }

            commands = scanner.nextLine();
        }
        printList(schedule);
    }

    private static void printList(List<String> elements) {
        int count = 1;
        for (String element : elements) {
            System.out.println(count + "." + element);
            count++;
        }
    }
}
