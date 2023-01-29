package arrrays.Exercise;

import java.util.Scanner;

public class zigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int[]numberArr1=new int[n];
        int[]numberArr2=new int[n];
        for (int i = 0; i <n ; i++) {
            String[]currentNum=scanner.nextLine().split(" ");
            if (i%2==0){
                numberArr1[i]=Integer.parseInt(currentNum[0]);
                numberArr2[i]=Integer.parseInt(currentNum[1]);
            }
            else {
                numberArr1[i]=Integer.parseInt(currentNum[1]);
                numberArr2[i]=Integer.parseInt(currentNum[0]);
            }
        }
        for (int j : numberArr1) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int k : numberArr2) {

            System.out.print(k + " ");
        }


    }
}
