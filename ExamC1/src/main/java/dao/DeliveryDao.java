package dao;

import interfaces.Exam;
import models.DeliveryWorker;

import java.util.ArrayList;

public class DeliveryDao implements Exam {

    ArrayList<DeliveryWorker> listDelivery = new ArrayList<>();

    @Override
    public boolean store(Object object) {
        DeliveryWorker deliveryWorker = (DeliveryWorker) object;
        try {
            listDelivery.add(deliveryWorker);
            return true;
        } catch (Exception e) {
            System.out.println("Error storing delivery worker: " + e.getMessage());
            return false;
        }
    }

    @Override
    public DeliveryWorker findByID(String id) {
        try {
            for (DeliveryWorker deliveryWorker : listDelivery) {
                if (deliveryWorker.getId().equals(id)) {
                    return deliveryWorker; // Devolver el trabajador encontrado
                }
            }
            System.out.println("Couldn't find delivery worker with id: " + id);
        } catch (Exception e) {
            System.out.println("Error trying to find delivery worker with id: " + id + "\nError: " + e.getMessage());
        }
        return null;
    }

    @Override
    public void findByName(String name) {
        try {
            boolean found = false;
            for (DeliveryWorker deliveryWorker : listDelivery) {
                if (deliveryWorker.getFirstName().equalsIgnoreCase(name)) {
                    System.out.println(deliveryWorker.toString());
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Couldn't find delivery worker with name: " + name);
            }
        } catch (Exception e) {
            System.out.println("Error trying to find delivery worker with name: " + name + "\nError: " + e.getMessage());
        }
    }
}
