package models;

public class CommercialWorker extends Worker {
    private double commission;

    // Constructors
    public CommercialWorker() {
        super();
    }

    public CommercialWorker(String id, String firstName, String lastName, int age, float salary, double commission) {
        super(id, firstName, lastName, age, salary); // Super Class Constructor
        this.commission = commission; // New Attribute
    }

    // Getter And Setter
    public double getCommission() {
        return commission;
    }
    public void setCommission(double commission) {
        this.commission = commission;
    }

    // "New" To-String Function
    @Override
    public String toString() {
        return "CommercialWorker{" +
                "commission='" + commission + '\'' +
                ", " + super.toString() + // Include properties from the Worker class
                '}';
    }

}
