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

        String menu = "1. Add New Worker\n2. Search Worker by ID\n3. Search Worker by First Name\n4. Calculate salary"
                + "\n5. Exit ---> ";

        int choice = 0;

        while (choice != 4) {
            System.out.println(menu);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Add the type of worker");
                    String menu2 = "1. Office Worker\n2. Delivery Worker\n3. Commercial Worker\n ---> ";
                    String id, name, surname;
                    int age;
                    float salary;
                    System.out.println(menu);
                    int worker = scanner.nextInt();
                    switch (worker) {
                        case 1:
                            System.out.println("Enter their name: ");
                            name = scanner.next();
                            System.out.println("Enter their surname: ");
                            surname = scanner.next();
                            System.out.println("Enter their id: ");
                            id = scanner.next();
                            System.out.println("Enter their age: ");
                            age = scanner.nextInt();
                            System.out.println("Enter their salary: ");
                            salary = scanner.nextFloat();
                            System.out.println("Enter their company position: ");
                            String position = scanner.next();
                            OfficeWorker worker1 = new OfficeWorker(id, name, surname, age, salary, position);
                            if(officeDao.save(worker1)){
                                System.out.println("\nOffice worker added successfully\n");
                            } else {
                                System.out.println("\nOffice worker couldn't be added\n");
                            }
                            break;
                        case 2:
                            System.out.println("Enter their name: ");
                            name = scanner.next();
                            System.out.println("Enter their surname: ");
                            surname = scanner.next();
                            System.out.println("Enter their id: ");
                            id = scanner.next();
                            System.out.println("Enter their age: ");
                            age = scanner.nextInt();
                            System.out.println("Enter their salary: ");
                            salary = scanner.nextFloat();
                            System.out.println("Enter their delivery area: ");
                            String deliveryArea = scanner.next();
                            DeliveryWorker worker2 = new DeliveryWorker(id, name, surname, age, salary, deliveryArea);
                            if(deliveryDao.save(worker2)){
                                System.out.println("\nDelivery worker added successfully\n");
                            } else {
                                System.out.println("\nDelivery worker couldn't be added\n");
                            }
                            break;
                        case 3:
                            System.out.println("Enter their name: ");
                            name = scanner.next();
                            System.out.println("Enter their surname: ");
                            surname = scanner.next();
                            System.out.println("Enter their id: ");
                            id = scanner.next();
                            System.out.println("Enter their age: ");
                            age = scanner.nextInt();
                            System.out.println("Enter their salary: ");
                            salary = scanner.nextFloat();
                            System.out.println("Enter their commission: ");
                            float commission = scanner.nextFloat();
                            CommercialWorker worker3 = new CommercialWorker(id, name, surname, age, salary, commission);
                            if(comDao.save(worker3)){
                                System.out.println("\nCommercial worker added successfully\n");
                            } else {
                                System.out.println("\nCommercial worker couldn't be added\n");
                            }
                            break;
                    }
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
