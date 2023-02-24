package objectsAndClasses.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class randomiseWord_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> words= Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        Random rdr=new Random();
        for (String word:words) {
            int indexX=rdr.nextInt(words.size());
            int indexY=rdr.nextInt(words.size());
            String currentWord=words.get(indexX);
           words.set(indexX,words.get(indexY));
           words.set(indexY,currentWord);
        }
        System.out.println(String.join(System.lineSeparator(),words));
    }
}
