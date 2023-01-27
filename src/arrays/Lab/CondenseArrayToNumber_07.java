package arrays.Lab;

import java.util.Scanner;

public class CondenseArrayToNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArr = input.split(" ");
        int[] nums = new int[inputArr.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(inputArr[i]);

        }
        int[] condensedArr = new int[nums.length - 1];
        for (int j = 0; j< nums.length; j++) {
            if (nums.length == 1) {
                break;
            }
            if (j== nums.length-1){
                int[]condensedNew=new int[condensedArr.length-1];
                j=-1;
                nums =condensedArr;
                condensedArr=condensedNew;
            }
            else{
                condensedArr[j]= nums[j]+ nums[j+1];

            }
        }
        System.out.println(nums[0]);
    }
}
