package AllIn;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[1]adding IT    [2]adding Manager    [3]adding SalesPerson  ");

            System.out.print("CHOOSE: ");
            int choose = sc.nextInt();
            sc.nextLine();

            switch (choose) {
                // It adding method
                case 1:

                    System.out.print("Enter name of IT:");
                    String name = sc.nextLine();
                    System.out.print("Enter age of IT:");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter birth of IT: ");
                    int birth = sc.nextInt();
                    sc.nextLine();
                    itPerson it = new itPerson(name, age, birth);
                    employees.add(it);
                    System.out.println("\n");
                    it.expertise();
                    System.out.println(it);
                    break;

                // manager adding method
                case 2:
                    System.out.print("Enter name of manager:");
                    String n = sc.nextLine();
                    System.out.print("Enter age of manager:");
                    int a = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter birth of manager: ");
                    int b = sc.nextInt();
                    sc.nextLine();
                    manager m = new manager(n, a, b);
                    employees.add(m);
                    System.out.println("\n");

                    m.expertise();
                    System.out.println(m);
                    break;

                // Salesperson
                case 3:
                    System.out.print("Enter name of SalesPerson:");
                    String na = sc.nextLine();
                    System.out.print("Enter age of SalesPerson:");
                    int ag = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter birth of SalesPerson: ");
                    int bi = sc.nextInt();
                    sc.nextLine();
                    salesPerson SP = new salesPerson(na, ag, bi);
                    employees.add(SP);

                    SP.expertise();
                    System.out.println(SP);

                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
            }
            System.out.println();
        }
    }
}
