public class Employee {
    private String name;
    private int id;
    private double hourlyWage;
    private double hoursWorked;

    public Employee(String name, int id, double hourlyWage, double hoursWorked) {
        this.name = name;
        this.id = id;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public double calculatePay() {
        return hourlyWage * hoursWorked;
    }

    public String toString() {
        return String.format("ID: %d | Name: %s | Hours Worked: %.2f | Hourly Wage: %.2f | Total Pay: %.2f",
                id, name, hoursWorked, hourlyWage, calculatePay());
    }
}
