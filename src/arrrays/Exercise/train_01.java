package arrrays.Exercise;

import java.util.Scanner;

public class train_01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int[]peopleArr=new int[n];
        for (int i = 0; i <n ; i++) {
            int people=Integer.parseInt(scanner.nextLine());
            peopleArr[i]+=people;
        }
        int sum=0;
        for (int number : peopleArr) {
            System.out.print(number + " ");
            sum += number;
        }
        System.out.println();
        System.out.println(sum);


    }
}
