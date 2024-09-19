package models;

public class DeliveryWorker extends Worker {
    private String area;

    public DeliveryWorker(String id, String firstName, String lastName, int age, double baseSalary, String area) {
        super(id, firstName, lastName, age, baseSalary);
        this.area = area;
    }

    @Override
    public double calculateNetSalary() {
        if (age < 25 && "Central".equals(area)) {
            baseSalary += INCENTIVE;
        }
        return super.calculateNetSalary();
    }

    // Getters y setters
}

