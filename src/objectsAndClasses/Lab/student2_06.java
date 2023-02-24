package objectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class student2_06 {
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

        public void setAge(String age) {
            this.age = age;
        }

        public String getHomeTown() {
            return homeTown;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
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
            if (isExisting(students, firstName, lastName)) {
                int index=getExistingIndex(students,firstName,lastName);
                students.get(index).setAge(age);
                students.get(index).setHomeTown(homeTown);

            } else {

                Student currentStudent = new Student(firstName, lastName, age, homeTown);
                students.add(currentStudent);
            }
            command = scanner.nextLine();
        }
        String input = scanner.nextLine();
        for (Student student : students) {
            if (input.equals(student.getHomeTown())) {
                System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }
    public static int getExistingIndex(List<Student> studentList, String firstName, String lastName){
        int index=-1;
        for (int i = 0; i <studentList.size() ; i++) {
            Student student=studentList.get(i);
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                index=i;
            }
        }
        return index;
    }

    public static Boolean isExisting(List<Student> studentList, String firstName, String lastName) {
        for (Student student : studentList) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }
}

