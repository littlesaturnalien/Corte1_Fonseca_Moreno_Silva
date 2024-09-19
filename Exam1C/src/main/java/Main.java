package main;

import dao.WorkerDAO;
import models.SalesWorker;
import models.DeliveryWorker;

public class Main {
    public static void main(String[] args) {
        WorkerDAO workerDAO = new WorkerDAO();

        // Agregar trabajadores
        workerDAO.addWorker(new SalesWorker("123", "Juan", "Perez", 35, 1000, 400));
        workerDAO.addWorker(new DeliveryWorker("456", "Carlos", "Lopez", 22, 800, "Central"));
        workerDAO.addWorker(new DeliveryWorker("789", "Maria", "Garcia", 30, 1200, "North"));

        // Buscar trabajador por ID
        System.out.println("Buscar Worker con ID 123:");
        System.out.println(workerDAO.findWorkerById("123"));

        // Mostrar todos los trabajadores
        System.out.println("\nLista de todos los trabajadores:");
        workerDAO.displayWorkers();
    }
}

