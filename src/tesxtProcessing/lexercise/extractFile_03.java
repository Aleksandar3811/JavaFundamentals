package tesxtProcessing.lexercise;

import java.util.Scanner;
import java.util.regex.Pattern;

public class extractFile_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String separator = "\\";
        String[] path = scanner.nextLine().split(Pattern.quote(separator));
        String separator1 = ".";
        String[] ne = path[path.length - 1].split(Pattern.quote(separator1));
        System.out.printf("File name: %s%n", ne[0]);
        System.out.printf("File extension: %s%n", ne[1]);


    }
}
