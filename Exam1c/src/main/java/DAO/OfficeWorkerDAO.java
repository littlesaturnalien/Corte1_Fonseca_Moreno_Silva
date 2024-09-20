package DAO;

import Interface.Exam1c;
import models.DeliveryWorker;
import models.OfficeWorker;

import java.util.ArrayList;

public class OfficeWorkerDAO implements Exam1c {
    ArrayList<OfficeWorker> offWorkers = new ArrayList<OfficeWorker>();

    @Override
    public boolean save(Object obj) {
        OfficeWorker officeWorker = (OfficeWorker) obj;
        try {
            offWorkers.add(officeWorker);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void findByID(String id) {
        try {
            for (OfficeWorker officeWorker : offWorkers) {
                if (officeWorker.getId().equals(id)) {
                    System.out.println(officeWorker.toString());
                    break;
                }
                System.out.println("Couldn't find office worker with id: " + id);
            }
        } catch (Exception e) {
            System.out.println("Error Trying to find office worker with id: " + id);
        }
    }

    @Override
    public void findByName(String name) {
        try {
            for (OfficeWorker officeWorker : offWorkers) {
                if (officeWorker.getFirstName().equals(name)) {
                    System.out.println(officeWorker.toString());
                    break;
                }
                System.out.println("Couldn't find office worker with name: " + name);
            }
        } catch (Exception e) {
            System.out.println("Error Trying to find office worker with name: " + name);
        }

    }
}
