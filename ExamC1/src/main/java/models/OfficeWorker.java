package models;

public class OfficeWorker extends Worker {
    private String companyPosition;

    public OfficeWorker(String id, String firstName, String lastName, int age, float salary, String companyPosition) {
        super(id, firstName, lastName, age, salary);
        this.companyPosition = companyPosition;
    }

    // Getters y Setters
    public String getCompanyPosition() {
        return companyPosition;
    }

    public void setCompanyPosition(String companyPosition) {
        this.companyPosition = companyPosition;
    }

    // Sobrescribir el método para calcular el salario neto con la deducción correspondiente
    @Override
    public float calculateNetSalary() {
        return getSalary() - (getSalary() * 0.07f); // Deducción del 7% para trabajadores de oficina
    }

    @Override
    public String toString() {
        return "OfficeWorker{" +
                "id='" + getId() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", age=" + getAge() +
                ", salary=" + getSalary() +
                ", companyPosition='" + companyPosition + '\'' +
                ", incentivo=" + INCENTIVO +
                '}';
    }
}
