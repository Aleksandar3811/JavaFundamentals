package DataTypesAndVariables.exercise;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        byte N = Byte.parseByte(scanner.nextLine());
        int bestSnowball = Integer.MIN_VALUE;
        int lastSnowballSnow=0;
        int lastSnowballTime=0;
        int lastSnowballQuality=0;
        for (int i = 1; i <= N; i++) {
            short snowballSnow = Short.parseShort(scanner.nextLine());
            short snowballTime = Short.parseShort(scanner.nextLine());
            byte snowballQuality = Byte.parseByte(scanner.nextLine());
            int snowballValue = (int) Math.pow(1.0 * snowballSnow / snowballTime, snowballQuality);
            if (snowballValue>bestSnowball){
                bestSnowball=snowballValue;
                lastSnowballSnow=snowballSnow;
                lastSnowballTime=snowballTime;
                lastSnowballQuality=snowballQuality;
            }

        }
        System.out.printf("%d : %d = %d (%d)",lastSnowballSnow,lastSnowballTime,bestSnowball,lastSnowballQuality);
    }
}
