package models;

import java.util.Objects;

public class Worker {
    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private float salary;
    private int economicIncentive = 300;

    // Constructors (Empty And With All Attributes)
    public Worker() {
    }
    public Worker(String id, String firstName, String lastName, int age, float salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    // Getters And Setters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public int getEconomicIncentive() {
        return economicIncentive;
    }
    public void setEconomicIncentive(int economicIncentive) {
        this.economicIncentive = economicIncentive;
    }

    // Equals-To Function
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker employee = (Worker) o;
        return age == employee.age && Float.compare(salary, employee.salary) == 0 && economicIncentive == employee.economicIncentive && Objects.equals(id, employee.id) && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    //Convert to Hash Code Function
    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, age, salary, economicIncentive);
    }

    // To-String Function
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("age=").append(age);
        sb.append(", id='").append(id).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", economicIncentive=").append(economicIncentive);
        sb.append('}');
        return sb.toString();
    }
}
