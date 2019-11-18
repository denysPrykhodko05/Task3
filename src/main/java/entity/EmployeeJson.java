package entity;

public class EmployeeJson extends Employee {
    private double salaryPerMonth;
    private double percentWorkedHours;

    @Override
    public boolean setWorkRate(double workRate) {
        return false;
    }

    @Override
    public boolean setWorkedHours(double workedHours) {
        return false;
    }

    @Override
    public double getPercentWorkedHours() {
        return percentWorkedHours;
    }

    @Override
    public double getSalaryPerMonth() {
        return salaryPerMonth;
    }
}
