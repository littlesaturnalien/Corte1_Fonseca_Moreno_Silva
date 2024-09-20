package models;

public class Worker {
    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private float salary;

    // Variable estática para incentivo
    public static final float INCENTIVO = 300;

    public Worker(String id, String firstName, String lastName, int age, float salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    // Getters y Setters
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

    // Método para calcular el salario neto (puede ser sobrescrito en las clases derivadas)
    public float calculateNetSalary() {
        return salary; // Retorna el salario sin deducción por defecto
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", incentivo=" + INCENTIVO +
                '}';
    }
}
