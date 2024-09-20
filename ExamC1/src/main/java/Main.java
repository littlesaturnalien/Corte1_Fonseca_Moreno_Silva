import dao.CommercialDao;
import dao.DeliveryDao;
import dao.OfficeDao;

import models.CommercialWorker;
import models.DeliveryWorker;
import models.OfficeWorker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CommercialDao comDao = new CommercialDao();
        DeliveryDao deliveryDao = new DeliveryDao();
        OfficeDao officeDao = new OfficeDao();

        String menu = "1. Add New Worker\n2. Search Worker by ID\n3. Search Worker by First Name\n4. Exit";
        int opc = 0;

        while (opc != 4) {
            System.out.println(menu);
            System.out.print("Enter your choice: ");

            try {
                opc = Integer.parseInt(scanner.nextLine());

                switch (opc) {
                    case 1:
                        System.out.println("\n~ Type Of Employee ~\n\n1. Commercial Worker\n2. Delivery Worker\n3. Office Worker");
                        int opcEmp = Integer.parseInt(scanner.nextLine());
                        switch (opcEmp) {
                            case 1:
                                // Add Commercial Worker
                                System.out.print("Employee ID: ");
                                String empId = scanner.nextLine();
                                System.out.print("First Name: ");
                                String firstName = scanner.nextLine();
                                System.out.print("Last Name: ");
                                String lastName = scanner.nextLine();
                                System.out.print("Age: ");
                                int age = Integer.parseInt(scanner.nextLine());
                                System.out.print("Salary: ");
                                float salary = Float.parseFloat(scanner.nextLine());
                                System.out.println("Commission: ");
                                double commission = Double.parseDouble(scanner.nextLine());

                                CommercialWorker commercialWorker = new CommercialWorker(empId, firstName, lastName, age, salary, commission);
                                comDao.store(commercialWorker);

                                // Additional logic based on age and commission
                                if (commercialWorker.getAge() > 30 && commercialWorker.getCommission() < 500) {
                                    commercialWorker.setSalary((float) (salary + (commercialWorker.getCommission() / 2)));
                                }
                                System.out.println("Worker Added");
                                break;

                            case 2:
                                // Add Delivery Worker
                                System.out.print("Employee ID: ");
                                String empIdd = scanner.nextLine();
                                System.out.print("First Name: ");
                                String firstNamee = scanner.nextLine();
                                System.out.print("Last Name: ");
                                String lastNamee = scanner.nextLine();
                                System.out.print("Age: ");
                                int agee = Integer.parseInt(scanner.nextLine());
                                System.out.print("Salary: ");
                                float salaryy = Float.parseFloat(scanner.nextLine());
                                System.out.println("Delivery Zone: ");
                                String zone = scanner.nextLine();

                                DeliveryWorker deliveryWorker = new DeliveryWorker(empIdd, firstNamee, lastNamee, agee, salaryy, zone);
                                deliveryDao.store(deliveryWorker);

                                // Additional logic for economic incentive
                                if (deliveryWorker.getAge() < 25 && deliveryWorker.getDeliveryArea().toUpperCase().equals("CIUDAD SANDINO")) {
                                    deliveryWorker.setEconomicIncentive(150);
                                }
                                System.out.println("Worker Added");
                                break;

                            case 3:
                                // Add Office Worker
                                System.out.print("Employee ID: ");
                                String empIddd = scanner.nextLine();
                                System.out.print("First Name: ");
                                String firstNameee = scanner.nextLine();
                                System.out.print("Last Name: ");
                                String lastNameee = scanner.nextLine();
                                System.out.print("Age: ");
                                int ageee = Integer.parseInt(scanner.nextLine());
                                System.out.print("Salary: ");
                                float salaryyy = Float.parseFloat(scanner.nextLine());
                                System.out.println("Company Position: ");
                                String position = scanner.nextLine();

                                OfficeWorker officeWorker = new OfficeWorker(empIddd, firstNameee, lastNameee, ageee, salaryyy, position);
                                officeDao.store(officeWorker);

                                // Additional logic based on company position
                                if (officeWorker.getCompanyPosition().toUpperCase().equals("MANAGER")) {
                                    officeWorker.setSalary(salaryyy + 100);
                                } else {
                                    officeWorker.setSalary(salaryyy + 400);
                                }
                                System.out.println("Worker Added");
                                break;
                        }
                        break;

                    case 2:
                        // Search Worker by ID
                        System.out.print("Enter Employee ID: ");
                        String searchId = scanner.nextLine();
                        System.out.println("\n~ Type Of Employee ~\n\n1. Commercial Worker\n2. Delivery Worker\n3. Office Worker");
                        int typeEmp = Integer.parseInt(scanner.nextLine());
                        switch (typeEmp) {
                            case 1:
                                CommercialWorker comWorker = comDao.findByID(searchId);
                                if (comWorker != null) {
                                    // Display Worker Information and Net Salary
                                    System.out.println("Employee ID: " + comWorker.getId());
                                    System.out.println("First Name: " + comWorker.getFirstName());
                                    System.out.println("Last Name: " + comWorker.getLastName());
                                    System.out.println("Age: " + comWorker.getAge());
                                    System.out.println("Gross Salary: " + comWorker.getSalary());
                                    System.out.println("Net Salary: " + comWorker.calculateNetSalary());
                                } else {
                                    System.out.println("Commercial Worker not found.");
                                }
                                break;
                            case 2:
                                DeliveryWorker delWorker = deliveryDao.findByID(searchId);
                                if (delWorker != null) {
                                    // Display Worker Information and Net Salary
                                    System.out.println("Employee ID: " + delWorker.getId());
                                    System.out.println("First Name: " + delWorker.getFirstName());
                                    System.out.println("Last Name: " + delWorker.getLastName());
                                    System.out.println("Age: " + delWorker.getAge());
                                    System.out.println("Gross Salary: " + delWorker.getSalary());
                                    System.out.println("Net Salary: " + delWorker.calculateNetSalary());
                                } else {
                                    System.out.println("Delivery Worker not found.");
                                }
                                break;
                            case 3:
                                OfficeWorker offWorker = officeDao.findByID(searchId);
                                if (offWorker != null) {
                                    // Display Worker Information and Net Salary
                                    System.out.println("Employee ID: " + offWorker.getId());
                                    System.out.println("First Name: " + offWorker.getFirstName());
                                    System.out.println("Last Name: " + offWorker.getLastName());
                                    System.out.println("Age: " + offWorker.getAge());
                                    System.out.println("Gross Salary: " + offWorker.getSalary());
                                    System.out.println("Net Salary: " + offWorker.calculateNetSalary());
                                } else {
                                    System.out.println("Office Worker not found.");
                                }
                                break;
                            default:
                                System.out.println("Not a valid option.");
                                break;
                        }
                        break;

                    case 3:
                        // Search Worker by First Name
                        System.out.print("Enter Employee First Name: ");
                        String searchName = scanner.nextLine();
                        System.out.println("\n~ Type Of Employee ~\n\n1. Commercial Worker\n2. Delivery Worker\n3. Office Worker");
                        int typeEmpName = Integer.parseInt(scanner.nextLine());
                        switch (typeEmpName) {
                            case 1:
                                comDao.findByName(searchName);
                                break;
                            case 2:
                                deliveryDao.findByName(searchName);
                                break;
                            case 3:
                                officeDao.findByName(searchName);
                                break;
                            default:
                                System.out.println("Not a valid option.");
                                break;
                        }
                        break;

                    case 4:
                        System.out.println("See you <3");
                        break;

                    default:
                        System.out.println("Not a valid choice - Please try again.");
                        break;
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
