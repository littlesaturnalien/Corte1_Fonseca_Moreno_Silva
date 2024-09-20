package dao;

import interfaces.Exam;
import models.DeliveryWorker;

import java.util.ArrayList;

public class DeliveryDao implements Exam {

    ArrayList<DeliveryWorker> listDelivery =  new ArrayList<>();

    @Override
    public boolean store(Object object) {
        DeliveryWorker deliveryWorker = (DeliveryWorker) object;
        try {
            listDelivery.add(deliveryWorker);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void findByID(String id) {
        try{
            for (DeliveryWorker deliveryWorker : listDelivery) {
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
            for (DeliveryWorker deliveryWorker : listDelivery) {
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
