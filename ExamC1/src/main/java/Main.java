import dao.CommercialDao;
import dao.DeliveryDao;
import dao.OfficeDao;

import models.CommercialWorker;
import models.DeliveryWorker;
import models.OfficeWorker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        CommercialDao comDao = new CommercialDao();
        DeliveryDao deliveryDao = new DeliveryDao();
        OfficeDao officeDao = new OfficeDao();

        String menu = "1. Add New Worker\n2. Search Worker by ID\n3. Search Worker by First Name\n4. Exit";

//        System.out.println(menu);

        int opc = 0;

        while (opc != 4){
            System.out.println(menu);
            System.out.print("Enter your choice: ");

            try{
                opc = Integer.parseInt(scanner.nextLine());

                switch (opc){
                    case 1:
                        System.out.println("\n~ Type Of Employee ~\n\n1. Commercial Worker\n2. DeliveryWorker\n3. OfficeWorker");
                        int opcEmp = Integer.parseInt(scanner.nextLine());
                        switch (opcEmp){
                            case 1:
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

                                if (commercialWorker.getAge() > 30 && commercialWorker.getCommission() < 500){
                                    commercialWorker.setSalary((float) (salary + (commercialWorker.getCommission() / 2)));
                                }
                                System.out.println("Worker Added");
                                break;

                            case 2:
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
                                if (deliveryWorker.getAge() < 25 && deliveryWorker.getDeliveryArea().toUpperCase().equals("CIUDAD SANDINO")){
                                    deliveryWorker.setEconomicIncentive(150);
                                }
                                System.out.println("Worker Added");

                                break;

                            case 3:
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
                                if (officeWorker.getCompanyPosition().toUpperCase().equals("MANAGER")){
                                    officeWorker.setSalary(salaryyy + 100);
                                } else { officeWorker.setSalary(salaryyy + 400); }
                                System.out.println("Worker Added");

                                break;
                        }
                        break;

                    case 2:
                        break;

                    case 3:
                        break;

                    case 4:
                        System.out.println("See you <3");
                        break;

                    default:
                        System.out.println("Not a valid choice - Please try again");
                        break;
                }

            } catch (NumberFormatException e){
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
