package OOP1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SMS s = new SMS();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\t\tStudent Management System\n\n");
            System.out.println("[1] add student \t[2]remove student\n");
            System.out.println("[3] find student\t [4] display all students\n");
            System.out.println("[5] exit");
            System.out.print("\t Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("\n Enter student id:");
                    int studentid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter name:");
                    String name = sc.nextLine();
                    System.out.println("Enter lastname:");
                    String lastname = sc.nextLine();
                    System.out.println("Enter age: ");
                    int age = sc.nextInt();
                    System.out.println("Enter Gpa:");
                    double gpa = sc.nextDouble();
                    sc.nextLine();
                    Student student = new Student(studentid, name, lastname, age, gpa);
                    s.addStudent(student);
                    System.out.println("\t done save");
                    break;
                case 2:
                    System.out.println("\n\tEnter remove student:");
                    int removeStudentid = sc.nextInt();
                    s.removeStudentid(removeStudentid);
                    break;
                case 3:
                    System.out.println("\n\tEnter Student id to find");
                    int findid = sc.nextInt();
                    Student foundStudent = s.findStudent(findid);
                    if (foundStudent != null) {
                        System.out.println("Student found" + foundStudent);
                    } else {
                        System.out.println("Student not found");
                    }
                    break;
                case 4:
                    s.displayAllStudents();
                    break;
                case 5:
                    System.out.println("exit...");
                    sc.close();
                    System.exit(0);

                    break;

                default:
                    System.out.println("invalid");
            }

        }
    }
}
