package AssociativeArraysLambdaAndStreamAPI.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class orders_03 {
    public static class Product {
        String name;
        Double price;
        int quantity;

        public Product(String name, Double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        String command = scanner.nextLine();
        while (!command.equals("buy")) {
            String name = command.split(" ")[0];
            double price = Double.parseDouble(command.split(" ")[1]);
            int quantity = Integer.parseInt(command.split(" ")[2]);
            boolean isContain = false;
            int index = -1;
            for (Product product : products) {
                if (product.getName().equals(name)) {
                    index = products.indexOf(product);
                    isContain = true;
                    break;
                }

            }
            if (isContain) {
                Product currentProduct = products.get(index);
                currentProduct.setQuantity(currentProduct.getQuantity() + quantity);
                currentProduct.setPrice(price);
            } else {

                Product product = new Product(name, price, quantity);
                products.add(product);
            }
            command = scanner.nextLine();
        }
        for (Product product : products) {
            System.out.printf("%s -> %.2f%n", product.getName(), product.getPrice() * product.getQuantity());
        }
    }
}
