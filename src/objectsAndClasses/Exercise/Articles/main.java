package objectsAndClasses.Exercise.Articles;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> article0=Arrays.stream(scanner.nextLine().split(","))
                .collect(Collectors.toList());
        String title=article0.get(0);
        String content=article0.get(1);
        String author=article0.get(2);
        articleClass.Article article=new articleClass.Article(title,content,author);


        int n=Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=n ; i++) {
            String command=scanner.nextLine();
            if (command.contains("Edit")){
                String newContent=command.split(":")[1];
                article.edit(newContent);
            }
            else if (command.contains("ChangeAuthor")){
                String newAuthor=command.split(":")[1];
                article.changeAuthor(newAuthor);
            }
            else if (command.contains("Rename")){
                String newTitle=command.split(":")[1];
                article.rename(newTitle);
            }
        }
        System.out.println(article);
    }
}
