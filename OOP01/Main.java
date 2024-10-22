package OOP01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SMS s = new SMS();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\t\tSystem Management System");
            System.out.println("\n\t[1]add student" + "\t" + "[2]remove");
            System.out.println("\t[3]findstudent" + "\t" + "[4]display all student ");
            System.out.println("\t[5]exit...");
            System.out.print("\n\tChoose:");
            int choose = sc.nextInt();
            sc.nextLine();

            switch (choose) {
                case 1:
                    System.out.print("\tEnter id:");
                    int studentid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("\t Enter name:");
                    String name = sc.nextLine();
                    System.out.print("\tEnter lastname:");
                    String lname = sc.nextLine();
                    System.out.print("\tage:");
                    int age = sc.nextInt();
                    sc.nextLine();

                    Students students = new Students(studentid, name, lname, age);
                    s.addStudents(students);
                    System.out.println("Done Save.....");
                    break;
                case 2:
                    System.out.println("Enter remove student:");
                    int removeStudentid = sc.nextInt();
                    s.removeStudents(removeStudentid);
                    break;

                case 3:
                    System.out.println("Find Student Id:");
                    int findid = sc.nextInt();
                    Students found = s.findStudents(findid);
                    if (found != null) {
                        System.out.println("Found Student" + found);
                    } else {
                        System.out.println("Student no found");
                    }
                    break;

                case 4:
                    System.out.println("\nDisplay All Students:");
                    s.displayAllStudents();
                    break;
                // exit
                case 5:
                    System.out.println("Exit....");
                    sc.close();
                    System.out.println(0);
                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
            }

        }
    }

}
