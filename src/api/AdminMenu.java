package api;

import java.util.Scanner;

public class AdminMenu {

    public static void printAdminMenu() {

        Scanner scanner = new Scanner(System.in);

        boolean adminRunning = true;

        while (adminRunning) {

            System.out.println();
            System.out.println("========================");
            System.out.println("      Admin Menu");
            System.out.println("========================");
            System.out.println("1. See all Customers");
            System.out.println("2. See all Rooms");
            System.out.println("3. See all Reservations");
            System.out.println("4. Add a Room");
            System.out.println("5. Back to Main Menu");
            System.out.println("========================");
            System.out.print("Please select a number: ");

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Display all customers");
                    break;

                case 2:
                    System.out.println("Display all rooms");
                    break;

                case 3:
                    System.out.println("Display all reservations");
                    break;

                case 4:
                    System.out.println("Add a room");
                    break;

                case 5:
                    adminRunning = false;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
