package arrrays.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class topIntegers_05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
//        String[]inputArr=scanner.nextLine().split(" ");
//        int[]numberArr=new int[inputArr.length];
//        for (int i = 0; i <numberArr.length ; i++) {
//            numberArr[i]=Integer.parseInt(inputArr[i]);
//        }
        int[] numberArr= Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt( Integer::parseInt)
                .toArray();
        for (int i = 0; i <numberArr.length ; i++) {
            if (i==numberArr.length-1){
                System.out.print(numberArr[i]);
                break;
            }
            boolean isBigger=true;
            for (int j =i+1; j <numberArr.length ; j++) {
                if (numberArr[i]<=numberArr[j]){
                    isBigger=false;
                    break;
                }
            }
            if (isBigger){
                System.out.print(numberArr[i]+" ");
            }
        }
    }
}
