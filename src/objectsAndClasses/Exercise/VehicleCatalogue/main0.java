package objectsAndClasses.Exercise.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main0 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Vehicle> vehicles = new ArrayList<>();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            vehicles.add(new Vehicle(tokens[0], tokens[1], tokens[2], Integer.parseInt(tokens[3])));
            input = scanner.nextLine();
        }
        String model = scanner.nextLine();
        double sumCar = 0;
        double sumTruck = 0;
        int countCar = 0;
        int countTruck = 0;
        while (!model.contains("Close")) {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getModel().equals(model)) {

                    System.out.println(vehicle);
                }
            }
            model = scanner.nextLine();
        }
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equals("car")) {
                sumCar += vehicle.getHorsepower();
                countCar++;
            } else if (vehicle.getType().equals("truck")) {
                sumTruck += vehicle.getHorsepower();
                countTruck++;
            }
        }
        double averageCars = sumCar / countCar;
        if (countCar == 0) {
            averageCars = 0;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCars);
        double averageTrucks = sumTruck / countTruck;
        if (countTruck == 0) {
            averageTrucks = 0;
        }
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTrucks);

    }
}
