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

        System.out.println(menu);



    }
}
