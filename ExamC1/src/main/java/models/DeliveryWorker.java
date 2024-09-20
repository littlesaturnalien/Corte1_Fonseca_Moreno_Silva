package models;

public class DeliveryWorker extends Worker {
    private String deliveryArea;
    private float economicIncentive; // Incentivo adicional específico para los repartidores

    public DeliveryWorker(String id, String firstName, String lastName, int age, float salary, String deliveryArea) {
        super(id, firstName, lastName, age, salary);
        this.deliveryArea = deliveryArea;
        this.economicIncentive = 0; // Inicialmente sin incentivo adicional
    }

    // Getters y Setters
    public String getDeliveryArea() {
        return deliveryArea;
    }

    public void setDeliveryArea(String deliveryArea) {
        this.deliveryArea = deliveryArea;
    }

    public float getEconomicIncentive() {
        return economicIncentive;
    }

    public void setEconomicIncentive(float economicIncentive) {
        this.economicIncentive = economicIncentive;
    }

    // Sobrescribir el método para calcular el salario neto con la deducción correspondiente
    @Override
    public float calculateNetSalary() {
        return getSalary() - (getSalary() * 0.10f) + economicIncentive; // Deducción del 10% y agregar incentivo
    }

    @Override
    public String toString() {
        return "DeliveryWorker{" +
                "id='" + getId() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", deliveryArea='" + deliveryArea + '\'' +
                ", economicIncentive=" + economicIncentive +
                ", incentivo=" + INCENTIVO +
                '}';
    }
}
