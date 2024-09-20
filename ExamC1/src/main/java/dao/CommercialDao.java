package dao;

import interfaces.Exam;
import models.CommercialWorker;

import java.util.ArrayList;

public class CommercialDao implements Exam {

    ArrayList<CommercialWorker> listCommercial = new ArrayList<>();

    @Override
    public boolean store(Object object) {
        CommercialWorker commercialWorker = (CommercialWorker) object;
        try {
            listCommercial.add(commercialWorker);
            return true;
        } catch (Exception e) {
            System.out.println("Error storing commercial worker: " + e.getMessage());
            return false;
        }
    }

    @Override
    public CommercialWorker findByID(String id) {
        try {
            for (CommercialWorker commercialWorker : listCommercial) {
                if (commercialWorker.getId().equals(id)) {
                    return commercialWorker; // Devolver el trabajador encontrado
                }
            }
            System.out.println("Couldn't find commercial worker with id: " + id);
        } catch (Exception e) {
            System.out.println("Error trying to find commercial worker with id: " + id + "\nError: " + e.getMessage());
        }
        return null;
    }

    @Override
    public void findByName(String name) {
        try {
            boolean found = false;
            for (CommercialWorker commercialWorker : listCommercial) {
                if (commercialWorker.getFirstName().equalsIgnoreCase(name)) {
                    System.out.println(commercialWorker.toString());
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Couldn't find commercial worker with name: " + name);
            }
        } catch (Exception e) {
            System.out.println("Error trying to find commercial worker with name: " + name + "\nError: " + e.getMessage());
        }
    }
}
