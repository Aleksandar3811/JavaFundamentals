package DataTypesAndVariables.exercise;

import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        byte num=Byte.parseByte(scanner.nextLine());
        short sum=0;
        for (int i = 1; i <=num ; i++) {
            char characters=scanner.nextLine().charAt(0);
            int asciiCode=(int)characters;
            sum+=asciiCode;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
