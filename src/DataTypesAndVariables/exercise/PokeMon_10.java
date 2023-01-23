package DataTypesAndVariables.exercise;

import java.util.Scanner;

public class PokeMon_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NPower = Integer.parseInt(scanner.nextLine());
        int MDistance = Integer.parseInt(scanner.nextLine());
        int YExhaustion = Integer.parseInt(scanner.nextLine());
        int targets=0;
        int originalN=NPower;
        while (originalN > 0) {
            if (originalN<MDistance){
                break;
            }
            targets++;
            originalN -= MDistance;
            if (NPower/2==originalN){
                if (YExhaustion!=0){

                    originalN/=YExhaustion;
                }
            }
        }
        System.out.println(originalN);
        System.out.println(targets);
    }
}
