package models;

public class CommercialWorker extends Worker {
    private double commission;

    public CommercialWorker(String id, String firstName, String lastName, int age, float salary, double commission) {
        super(id, firstName, lastName, age, salary);
        this.commission = commission;
    }

    // Getters y Setters
    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    // Sobrescribir el método para calcular el salario neto con la deducción correspondiente
    @Override
    public float calculateNetSalary() {
        return getSalary() - (getSalary() * 0.07f); // Deducción del 7% para trabajadores comerciales
    }

    @Override
    public String toString() {
        return "CommercialWorker{" +
                "id='" + getId() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", commission=" + commission +
                ", incentivo=" + INCENTIVO +
                '}';
    }
}
