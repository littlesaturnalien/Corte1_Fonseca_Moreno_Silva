package DAO;

import Interface.Exam1c;
import models.DeliveryWorker;

import java.util.ArrayList;

public class DeliveryWorkerDAO implements Exam1c {
    ArrayList<DeliveryWorker> delWorkers = new ArrayList<DeliveryWorker>();

    @Override
    public boolean save(Object obj) {
        DeliveryWorker deliveryWorker = (DeliveryWorker) obj;
        try {
            delWorkers.add(deliveryWorker);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void findByID(String id) {
        try{
            for (DeliveryWorker deliveryWorker : delWorkers) {
                if (deliveryWorker.getId().equals(id)) {
                    System.out.println(deliveryWorker.toString());
                    break;
                }
                System.out.println("Couldn't find delivery worker with id: " + id);
            }
        } catch (Exception e) {
            System.out.println("Error Trying to find delivery worker with id: " + id);
        }
    }

    @Override
    public void findByName(String name) {
        try{
            for (DeliveryWorker deliveryWorker : delWorkers) {
                if (deliveryWorker.getFirstName().equals(name)) {
                    System.out.println(deliveryWorker.toString());
                    break;
                }
                System.out.println("Couldn't find delivery worker with name: " + name);
            }
        } catch (Exception e) {
            System.out.println("Error Trying to find delivery worker with name: " + name);
        }
    }
}
