package examPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class p03 {
    static class Car {
        String name;
        int mileage;
        int fuel;

        public Car(String name, int mileage, int fuel) {
            this.name = name;
            this.mileage = mileage;
            this.fuel = fuel;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] inputArr = input.split("\\|");
            String name = inputArr[0];
            int mileage = Integer.parseInt(inputArr[1]);
            int fuel = Integer.parseInt(inputArr[2]);
            Car currentCar = new Car(name, mileage, fuel);
            carList.add(currentCar);

        }
        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            String[] commands = (command.split(" : "));
            if (command.startsWith("Drive")) {
                String name = commands[1];
                int distance = Integer.parseInt(commands[2]);
                int fuel = Integer.parseInt(commands[3]);
                for (Car car : carList) {
                    if (car.getName().equals(name)) {
                        if (car.getFuel() >= fuel) {
                            car.setMileage(car.getMileage() + distance);
                            car.setFuel(car.getFuel() - fuel);
                            System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car.getName(), distance, fuel);
                        } else {
                            System.out.println("Not enough fuel to make that ride");
                        }
                        if (car.getMileage() >= 100000) {
                            System.out.printf("Time to sell the %s!%n", car.getName());
                            carList.remove(car);

                        }
                        break;
                    }

                }
            } else if (command.startsWith("Refuel")) {
                String name = commands[1];
                int fuel = Integer.parseInt(commands[2]);
                for (Car car : carList) {
                    if (car.getName().equals(name)) {
                        int currentFuel = car.getFuel();
                        car.setFuel(car.getFuel() + fuel);
                        if (car.getFuel() > 75) {
                            car.setFuel(75);
                            int refueled = 75 - currentFuel;
                            System.out.printf("%s refueled with %d liters%n", car.getName(), refueled);
                        } else {
                            System.out.printf("%s refueled with %d liters%n", car.getName(), fuel);
                        }
                        break;
                    }
                }

            } else if (command.startsWith("Revert")) {
                String name = commands[1];
                int km = Integer.parseInt(commands[2]);
                for (Car car : carList) {
                    if (car.getName().equals(name)) {
                        car.setMileage(car.getMileage() - km);
                        if (car.getMileage() < 10000) {
                            car.setMileage(10000);
                        } else {
                            System.out.printf("%s mileage decreased by %d kilometers%n", car.getName(), km);
                        }
                        break;
                    }
                }

            }
            command = scanner.nextLine();

        }
        carList.forEach((key) -> System.out.println(key.getName() + " -> " + "Mileage: " + key.getMileage() + " kms, Fuel in the tank: " + key.getFuel() + " lt. "));
    }
}
