package objectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class students_05 {
    static class Student {
        String firstName;
        String lastName;
        String age;
        String homeTown;

        public Student(String firstName, String lastName, String age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }


        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAge() {
            return age;
        }

        public String getHomeTown() {
            return homeTown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        List<Student> students = new ArrayList<>();
        while (!command.equals("end")) {
            String[] inputArr = command.split(" ");
            String firstName = inputArr[0];
            String lastName = inputArr[1];
            String age = inputArr[2];
            String homeTown = inputArr[3];
            Student currentStudent = new Student(firstName, lastName, age, homeTown);
            students.add(currentStudent);
            command = scanner.nextLine();
        }
        String input = scanner.nextLine();
        for (Student student : students) {
            if (input.equals(student.getHomeTown())) {
                System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
}
