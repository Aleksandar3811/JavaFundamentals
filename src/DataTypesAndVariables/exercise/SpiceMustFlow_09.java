package DataTypesAndVariables.exercise;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int startingYield=Integer.parseInt(scanner.nextLine());
        int days=0;
        int consuming=0;
        int extraction=0;
        while(startingYield>0){
            consuming+=26;
            if (startingYield<26){
                consuming-=26;
            }
            if (startingYield<100){
                break;
            }
            days++;
            extraction+=startingYield;
            startingYield-=10;
        }
        System.out.println(days);
        System.out.println(extraction-consuming);
    }
}
