package tesxtProcessing.lexercise;

import java.math.BigInteger;
import java.util.Scanner;

public class multiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BigInteger num1=scanner.nextBigInteger();
        //BigInteger num1=new BugInteger(scanner.nextLine());
        BigInteger num2=scanner.nextBigInteger();
        System.out.println(num1.multiply(num2));

    }
}
