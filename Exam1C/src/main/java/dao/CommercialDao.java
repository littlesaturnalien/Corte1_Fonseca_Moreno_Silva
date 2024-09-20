package dao;

import interfaces.Exam;
import models.CommercialWorker;

import java.util.ArrayList;

public class CommercialDao implements Exam {

    public ArrayList<CommercialWorker> listCommercial = new ArrayList<>();

    @Override
    public boolean store(Object object) {
        CommercialWorker commercialWorker = (CommercialWorker) object;
        try {
            listCommercial.add(commercialWorker);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void findByID(String id) {
        try {
            for (CommercialWorker commercialWorker : listCommercial) {
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
            for (CommercialWorker commercialWorker : listCommercial) {
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
