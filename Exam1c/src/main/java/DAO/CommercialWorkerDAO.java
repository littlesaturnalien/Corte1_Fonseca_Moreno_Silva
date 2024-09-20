package DAO;

import Interface.Exam1c;
import models.CommercialWorker;

import java.util.ArrayList;

public class CommercialWorkerDAO implements Exam1c {
    ArrayList<CommercialWorker> commWorkers = new ArrayList<CommercialWorker>();

    @Override
    public boolean save(Object obj) {
        CommercialWorker commercialWorker = (CommercialWorker) obj;
        try {
            commWorkers.add(commercialWorker);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void findByID(String id) {
        try {
            for (CommercialWorker commercialWorker : commWorkers) {
                if (commercialWorker.getId().equals(id)) {
                    System.out.println(commercialWorker.toString());
                    break;
                }
                System.out.println("Couldn't find commercial worker with id: " + id);
            }
        } catch (Exception e) {
            System.out.println("Error Trying to find commercial worker with id: " + id + "\nError: " + e.getMessage());
        }
    }

    @Override
    public void findByName(String name) {
        try {
            for (CommercialWorker commercialWorker : commWorkers) {
                if (commercialWorker.getFirstName().equals(name)) {
                    System.out.println(commercialWorker.toString());
                    break;
                }
                System.out.println("Couldn't find commercial worker with name: " + name);
            }
        } catch (Exception e) {
            System.out.println("Error Trying to find commercial worker with name: " + name + "\nError: " + e.getMessage());
        }
    }
}
