
import dao.CommercialDao;
import dao.DeliveryDao;
import dao.OfficeDao;
import models.CommercialWorker;
import models.DeliveryWorker;
import models.OfficeWorker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create instances of the DAOs
        CommercialDao commercialDao = new CommercialDao();
        DeliveryDao deliveryDao = new DeliveryDao();
        OfficeDao officeDao = new OfficeDao();
        Scanner scanner = new Scanner(System.in);
        String input;

        // User interaction
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Commercial Worker");
            System.out.println("2. Add Delivery Worker");
            System.out.println("3. Add Office Worker");
            System.out.println("4. Find Commercial Worker by ID");
            System.out.println("5. Find Delivery Worker by ID");
            System.out.println("6. Find Office Worker by ID");
            System.out.println("7. Find Commercial Worker by Name");
            System.out.println("8. Find Delivery Worker by Name");
            System.out.println("9. Find Office Worker by Name");
            System.out.println("10. Show All Commercial Workers");
            System.out.println("11. Show All Delivery Workers");
            System.out.println("12. Show All Office Workers");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");
            input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("Enter ID: ");
                    String cId = scanner.nextLine();
                    System.out.print("Enter First Name: ");
                    String cFirstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String cLastName = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int cAge = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter Salary: ");
                    float cSalary = Float.parseFloat(scanner.nextLine());
                    System.out.print("Enter Commission: ");
                    double cCommission = Double.parseDouble(scanner.nextLine());
                    commercialDao.store(new CommercialWorker(cId, cFirstName, cLastName, cAge, cSalary, cCommission));
                    break;
                case "2":
                    System.out.print("Enter ID: ");
                    String dId = scanner.nextLine();
                    System.out.print("Enter First Name: ");
                    String dFirstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String dLastName = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int dAge = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter Salary: ");
                    float dSalary = Float.parseFloat(scanner.nextLine());
                    System.out.print("Enter Delivery Area: ");
                    String deliveryArea = scanner.nextLine();
                    deliveryDao.store(new DeliveryWorker(dId, dFirstName, dLastName, dAge, dSalary, deliveryArea));
                    break;
                case "3":
                    System.out.print("Enter ID: ");
                    String oId = scanner.nextLine();
                    System.out.print("Enter First Name: ");
                    String oFirstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String oLastName = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int oAge = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter Salary: ");
                    float oSalary = Float.parseFloat(scanner.nextLine());
                    System.out.print("Enter Company Position: ");
                    String position = scanner.nextLine();
                    officeDao.store(new OfficeWorker(oId, oFirstName, oLastName, oAge, oSalary, position));
                    break;
                case "4":
                    System.out.print("Enter ID of Commercial Worker: ");
                    commercialDao.findByID(scanner.nextLine());
                    break;
                case "5":
                    System.out.print("Enter ID of Delivery Worker: ");
                    deliveryDao.findByID(scanner.nextLine());
                    break;
                case "6":
                    System.out.print("Enter ID of Office Worker: ");
                    officeDao.findByID(scanner.nextLine());
                    break;
                case "7":
                    System.out.print("Enter Name of Commercial Worker: ");
                    commercialDao.findByName(scanner.nextLine());
                    break;
                case "8":
                    System.out.print("Enter Name of Delivery Worker: ");
                    deliveryDao.findByName(scanner.nextLine());
                    break;
                case "9":
                    System.out.print("Enter Name of Office Worker: ");
                    officeDao.findByName(scanner.nextLine());
                    break;
                case "10":
                    System.out.println("List of Commercial Workers:");
                    for (CommercialWorker worker : commercialDao.listCommercial) {
                        System.out.println(worker);
                    }
                    break;
                case "11":
                    System.out.println("List of Delivery Workers:");
                    for (DeliveryWorker worker : deliveryDao.listDelivery) {
                        System.out.println(worker);
                    }
                    break;
                case "12":
                    System.out.println("List of Office Workers:");
                    for (OfficeWorker worker : officeDao.listOffice) {
                        System.out.println(worker);
                    }
                    break;
                case "0":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
