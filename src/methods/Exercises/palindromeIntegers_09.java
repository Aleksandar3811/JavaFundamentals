package methods.Exercises;

import java.util.Scanner;

public class palindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")) {
           int number =Integer.parseInt(input);
           int reversedNumber=numberPalindrome(number);
            if (number==reversedNumber) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input = scanner.nextLine();
        }
    }

    public static int numberPalindrome(int n) {
        String numS=String.valueOf(n);
        String text ="";
        for (int i = numS.length() - 1; i >= 0; i--) {
           text+=numS.charAt(i);
        }
        int i =Integer.parseInt(String.valueOf(text));
        return i;
    }

}
