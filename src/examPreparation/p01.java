package examPreparation;

import java.util.Scanner;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage = scanner.nextLine();
        StringBuilder sb = new StringBuilder(encryptedMessage);
        String input = scanner.nextLine();
        while (!input.equals("Decode")) {
            String[] operations = input.split("\\|");
            if (input.startsWith("Move")) {
                int n = Integer.parseInt(operations[1]);
                String substring = sb.substring(0, n);
                sb.replace(0, n, "");
                sb.append(substring);

            } else if (input.startsWith("Insert")) {
                int n = Integer.parseInt(operations[1]);
                String letter = operations[2];
                sb.insert(n,letter);
            } else if (input.startsWith("ChangeAll")) {
                String textForChange = operations[1];
                String replacement = operations[2];
                String currentMessage = sb.toString();
                currentMessage = currentMessage.replace(textForChange, replacement);
                sb = new StringBuilder(currentMessage);
            }
            input = scanner.nextLine();
        }
        System.out.println("The decrypted message is: " + sb);

    }
}
