package list.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class pokemonDontGo_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int sum=0;
        while(numbers.size()>0) {
            int index = Integer.parseInt(scanner.nextLine());
            if (index<0){
                int firstElement=numbers.get(0);
                numbers.remove(0);
                sum+=firstElement;
                int lastElement=numbers.get(numbers.size()-1);
                numbers.add(0,lastElement);
                modifyList(numbers,firstElement);
            }
            else if (index>numbers.size()-1){
                int lastNumber=numbers.get(numbers.size()-1);
                numbers.remove(numbers.size()-1);
                sum+=lastNumber;
                int firstElement=numbers.get(0);
                numbers.add(firstElement);
                modifyList(numbers,lastNumber);
            }
            else if (index>=0&&index<=numbers.size()-1){
                int removedElement=numbers.get(index);
                sum+=removedElement;
                numbers.remove(index);
                modifyList(numbers,removedElement);
            }
        }
        System.out.println(sum);
    }

    private static void modifyList(List<Integer> numbers, int removedNumber) {
        for (int index = 0; index <numbers.size() ; index++) {
            int currentElement=numbers.get(index);
            if (currentElement<=removedNumber){
                currentElement+=removedNumber;
            }
            else {
                currentElement-=removedNumber;
            }
            numbers.set(index,currentElement);
        }
    }
}
