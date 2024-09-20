package dao;

import interfaces.Exam;
import models.OfficeWorker;

import java.util.ArrayList;

public class OfficeDao implements Exam {

    ArrayList<OfficeWorker> listOffice = new ArrayList<>();

    @Override
    public boolean store(Object object) {
        OfficeWorker officeWorker = (OfficeWorker) object;
        try {
            listOffice.add(officeWorker);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public OfficeWorker findByID(String id) {
        try {
            for (OfficeWorker officeWorker : listOffice) {
                if (officeWorker.getId().equals(id)) {
                    return officeWorker; // Devolver el trabajador encontrado
                }
            }
            System.out.println("Couldn't find office worker with id: " + id); // Mensaje si no se encontró
        } catch (Exception e) {
            System.out.println("Error Trying to find office worker with id: " + id + "\nError: " + e.getMessage());
        }
        return null; // Devolver null si no se encuentra
    }

    @Override
    public void findByName(String name) {
        try {
            boolean found = false; // Variable para controlar si se encuentra el trabajador
            for (OfficeWorker officeWorker : listOffice) {
                if (officeWorker.getFirstName().equals(name)) {
                    System.out.println(officeWorker.toString());
                    found = true; // Se encontró el trabajador
                    break;
                }
            }
            if (!found) {
                System.out.println("Couldn't find office worker with name: " + name); // Mensaje si no se encontró
            }
        } catch (Exception e) {
            System.out.println("Error Trying to find office worker with name: " + name + "\nError: " + e.getMessage());
        }
    }
}
