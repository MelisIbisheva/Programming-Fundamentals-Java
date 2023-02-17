package Lab_ObjectsandClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students_05 {

    static class Student{
        private String firstName;
        private String lastName;
        private int age;
        private String town;

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getAge() {
            return this.age;
        }

        public String getTown() {
            return this.town;
        }

        public Student(String firstName, String lastName, int age, String town){
            this.firstName=firstName;
            this.lastName=lastName;
            this.age=age;
            this.town=town;


        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();
        String inputLines = scanner.nextLine();
        while (!inputLines.equals("end")){
            String[] arrStudentsData = inputLines.split("\\s+");
            String firsName = arrStudentsData[0];
            String lastName = arrStudentsData[1];
            int age = Integer.parseInt(arrStudentsData[2]);
            String town= arrStudentsData[3];

            Student currentStudent = new Student(firsName, lastName,age,town);
            studentList.add(currentStudent);




            inputLines=scanner.nextLine();
        }

        String homeTown = scanner.nextLine();
        for(Student item : studentList){
            if(item.getTown().equals(homeTown)){
                System.out.printf("%s %s is %d years old"+System.lineSeparator(), item.getFirstName(), item.getLastName(), item.getAge());
            }
        }

    }
}
