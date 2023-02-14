package list.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class houseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCommands = Integer.parseInt(scanner.nextLine());
        List<String> guestsList = new ArrayList<>();
        for (int i = 1; i <= numberCommands; i++) {
            String command = scanner.nextLine();
            String currentGuest = command.split(" ")[0];
            if (command.contains("not")) {
                if (guestsList.contains(currentGuest)) {
                    guestsList.remove(currentGuest);
                } else {
                    System.out.printf("%s is not in the list!\n", currentGuest);
                }
            } else {
                if (guestsList.contains(currentGuest)) {
                    System.out.printf("%s is already in the list!\n", currentGuest);
                } else {

                    guestsList.add(currentGuest);
                }

            }

        }
        for (String guest : guestsList) {
            System.out.println(guest);
        }
    }
}
