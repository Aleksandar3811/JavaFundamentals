package list.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationAdvanced_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if (command.startsWith("Contains")) {
                int num =Integer.parseInt(command.split(" ")[1]);
                isContain(numbers, num);
            } else if (command.contains("even")) {
                isEven(numbers);
            } else if (command.contains("odd")) {
                isOdd(numbers);
            } else if (command.contains("Get")) {
                sumOfAllNumbers(numbers);
            } else if (command.contains("Filter")) {
                String condition = command.split(" ")[1];
                int number = Integer.parseInt(command.split(" ")[2]);
                filterNumbers(numbers, condition, number);
            }
            command = scanner.nextLine();
        }
    }

    private static void filterNumbers(List<Integer> numbers, String condition, int number) {
        switch (condition) {
            case "<":
                for (int num : numbers) {
                    if (num < number) {
                        System.out.print(num+" ");
                    }
                }
                break;
            case ">":
                for (int num : numbers) {
                    if (num > number) {
                        System.out.print(num+" ");
                    }
                }
                break;
            case ">=":
                for (int num : numbers) {
                    if (num >= number) {
                        System.out.print(num+" ");
                    }
                }
                break;
            case "<=":
                for (int num : numbers) {
                    if (num <= number) {
                        System.out.print(num+" ");
                    }
                }
                break;

        }
        System.out.println();
    }

    private static void sumOfAllNumbers(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println(sum);
    }

    private static void isOdd(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.print(number+" ");
            }

        }
        System.out.println();
    }

    private static void isEven(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number+" ");
            }
        }
        System.out.println();
    }

    private static void isContain(List<Integer> numbers, int num) {
       if (numbers.contains(num)){
           System.out.println("Yes");
       }
       else {
           System.out.println("No such number");
       }
    }


}
