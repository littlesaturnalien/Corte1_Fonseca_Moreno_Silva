package models;

import java.util.Objects;

public class DeliveryWorker extends Worker {
    private String deliveryArea; // Zone it's the same

    // Constructors
    public DeliveryWorker() {
        super(); // This call the parent class constructor
    }

    public DeliveryWorker(String id, String firstName, String lastName, int age, float salary, String deliveryArea) {
        super(id, firstName, lastName, age, salary); // Super Class Constructor
        this.deliveryArea = deliveryArea; // New Attribute
    }

    // Getter And Setter (For New Attribute)
    public String getDeliveryArea() {
        return deliveryArea;
    }
    public void setDeliveryArea(String deliveryArea) {
        this.deliveryArea = deliveryArea;
    }

    // "New" To-String Function
    @Override
    public String toString() {
        return "DeliveryWorker{" +
                "deliveryArea='" + deliveryArea + '\'' +
                ", " + super.toString() + // Include properties from the Worker class
                '}';
    }

    public float calculateSalary() {
        return getSalary() - (getSalary() * 0.10F);
    }
}
