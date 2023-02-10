package methods.Exercises;

import java.util.Scanner;

public class charactersInRange_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        printAllCharactersInRange(first,second);
    }

    public static void printAllCharactersInRange(char n1, char n2) {
        while (n1 != n2) {
            if (n2 < n1) {
                n2++;
                if (n2 == n1) {
                    break;
                }
                System.out.print(n2 + " ");
            } else {
                n1++;
                if (n1 == n2) {
                    break;
                }
                System.out.print(n1 + " ");
            }
        }
    }
}
