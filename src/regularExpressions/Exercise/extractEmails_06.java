package regularExpressions.Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractEmails_06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String regex="\\b[0-9ZA-Za-z]+[.\\-_]?[0-9A-Za-z]+@[A-Za-z]+-?[A-Za-z]+(\\.[A-Za-z]+-?[A-Za-z]+)+\\b";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(input);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
