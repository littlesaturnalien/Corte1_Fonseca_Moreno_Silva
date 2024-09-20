package models;

public class OfficeWorker extends Worker {
    private String companyPosition;

    // Constructors
    public OfficeWorker() {
        super();
    }

    public OfficeWorker(String id, String firstName, String lastName, int age, float salary, String companyPosition) {
        super(id, firstName, lastName, age, salary); // Super Class Constructor
        this.companyPosition = companyPosition; // New Attribute
    }

    // Getter And Setter (For New Attribute)
    public String getCompanyPosition() {
        return companyPosition;
    }
    public void setCompanyPosition(String companyPosition) {
        this.companyPosition = companyPosition;
    }

    // "New" To-String Function
    @Override
    public String toString() {
        return "OfficeWroker{" +
                "companyPosition='" + companyPosition + '\'' +
                ", " + super.toString() + // Include properties from the Worker class
                '}';
    }
}