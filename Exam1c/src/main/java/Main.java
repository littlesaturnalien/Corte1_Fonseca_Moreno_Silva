import DAO.*;
import Interface.Exam1c;
import models.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CommercialWorkerDAO comDao = new CommercialWorkerDAO();
        DeliveryWorkerDAO deliveryDao = new DeliveryWorkerDAO();
        OfficeWorkerDAO officeDao = new OfficeWorkerDAO();

        String menu = "1. Add New Worker\n2. Search Worker by ID\n3. Search Worker by First Name\n4. Exit"
                + "\n ---> ";

        int choice = 0;

        while (choice != 4) {
            System.out.println(menu);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3: 
                    break;
                case 4:
                    System.out.println("Terminating the program...");
                    break;
                default:
                    System.out.println("Enter a valid choice");
                    break;
            }
        }
    }
}
