package arrrays.Exercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class arrayRotation_04 {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       String[]inputArr=scanner.nextLine().split(" ");
       int n=Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <=n ; i++) {
            String firstElement=inputArr[0];
            for (int index = 0; index <inputArr.length-1 ; index++) {
                inputArr[index]=inputArr[index+1];

            }
            inputArr[inputArr.length-1]=firstElement;
        }
        for (String element:inputArr) {
            System.out.print(element+" ");
        }
    }
}
