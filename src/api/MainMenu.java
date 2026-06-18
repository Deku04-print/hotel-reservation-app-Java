package api;

import java.util.Scanner;

public class MainMenu {

    public static void printMenu() {

        System.out.println();
        System.out.println("=================================");
        System.out.println(" Hotel Reservation Application");
        System.out.println("=================================");
        System.out.println("1. Find and reserve a room");
        System.out.println("2. See my reservations");
        System.out.println("3. Create an account");
        System.out.println("4. Admin");
        System.out.println("5. Exit");
        System.out.println("=================================");
        System.out.print("Please select a number: ");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            printMenu();

            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Find and reserve a room");
                    break;

                case 2:
                    System.out.println("See my reservations");
                    break;

                case 3:
                    System.out.println("Create an account");
                    break;

                case 4:
                    AdminMenu.printAdminMenu();
                    break;

                case 5:
                    System.out.println("Thank you for using the Hotel Reservation Application.");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option.");
            }
        }

        scanner.close();
    }
}
