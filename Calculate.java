import java.util.Scanner;

public class Calculate {
    public int piso() {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[1]add" + "[2]sub ");
            System.out.print("Choose:");
            int choose = sc.nextInt();
            sc.nextLine();

            switch (choose) {
                case 1:
                    System.out.print("Enter First Number:");
                    int num1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Second Number:");
                    int num2 = sc.nextInt();
                    sc.nextLine();

                    System.out.println(num1 + num2);

                    break;

                case 2:

                    System.out.print("Enter First Number:");
                    int num01 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Second Number:");
                    int num02 = sc.nextInt();
                    sc.nextLine();

                    System.out.println(num01 - num02);

                    break;

                default:
                    System.out.println("Invalid Input");
                    break;
            }

        }

    }
}
