package methods.Lab;

import java.util.Scanner;

public class orders_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputOrder = scanner.nextLine();
        int quantity=Integer.parseInt(scanner.nextLine());
        calculatingTotalPrice(inputOrder,quantity);

    }
    public static void calculatingTotalPrice(String product,int quantity){
        double price = 0.0;
        switch (product){
            case "coffee":
                price=1.50;
            break;
            case"water":
                price=1.00;
                break;
            case "coke":
                price=1.40;
                break;
            case "snacks":
                price=2.00;
                break;
        }
        double sum =quantity*price;
        System.out.printf("%.2f",sum);
    }
}
