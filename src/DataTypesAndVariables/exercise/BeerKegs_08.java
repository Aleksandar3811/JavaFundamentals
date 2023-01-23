package DataTypesAndVariables.exercise;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        double maxValue=Double.MIN_VALUE;
        String  max=" ";
        for (int i = 1; i <=n ; i++) {
            String model=scanner.nextLine();
            double radius=Double.parseDouble(scanner.nextLine());
            int height=Integer.parseInt(scanner.nextLine());
            double volume=Math.PI*(Math.pow(radius,2)*height);
            if (volume>maxValue){
                maxValue=volume;
                max=model;
            }

        }
        System.out.println(max);

    }
}
