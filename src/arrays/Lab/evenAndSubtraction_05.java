package arrays.Lab;

import java.util.Scanner;

public class evenAndSubtraction_05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");
        int[] numberArrs = new int[inputArr.length];
        for (int i = 0; i < numberArrs.length; i++) {
            numberArrs[i] = Integer.parseInt(inputArr[i]);
        }
//        int[] numbersArr = Arrays
//                .stream(scanner.nextLine().split(" "))
//                .mapToInt(Integer::parseInt)
//                .toArray();
        int evenSum=0;
        int oddSum=0;
        for (int item: numberArrs) {
            if (item%2==0){
                evenSum+=item;
            }
            else {
                oddSum+=item;
            }
        }
        System.out.println(evenSum-oddSum);

    }



}
