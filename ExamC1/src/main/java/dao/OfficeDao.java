package dao;

import interfaces.Exam;
import models.OfficeWorker;

import java.util.ArrayList;

public class OfficeDao implements Exam {

    ArrayList<OfficeWorker> listOffice = new ArrayList<>();

    @Override
    public boolean store(Object object) {
        OfficeWorker officeWorker = (OfficeWorker) object;
        try{
            listOffice.add(officeWorker);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void findByID(String id) {
        try {
            for (OfficeWorker officeWorker : listOffice) {
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
            for (OfficeWorker officeWorker : listOffice) {
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
