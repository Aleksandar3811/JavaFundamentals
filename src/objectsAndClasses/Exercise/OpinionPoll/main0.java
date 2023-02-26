package objectsAndClasses.Exercise.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main0 {
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return this.name + " - " + this.age;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();
        for (int i = 1; i <= lines; i++) {
            String data = scanner.nextLine();
            int age = Integer.parseInt(data.split(" ")[1]);
            String name = data.split(" ")[0];
            if (age > 30) {
               Person person = new Person(name, age);
                personList.add(person);
            }
        }
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
