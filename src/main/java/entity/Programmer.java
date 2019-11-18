package entity;

public class Programmer extends Employee {
    private double workRate;
    private double workedHours;

    final int norm = 160;

    @Override
    public boolean setWorkRate(double workRate) {
        this.workRate = workRate;
        return workRate != 0;
    }

    @Override
    public boolean setWorkedHours(double workedHours) {
        this.workedHours = workedHours;
        return this.workedHours!=0;
    }

    @Override
    public double getPercentWorkedHours() {
        return workedHours * 100 / norm;
    }

    @Override
    public double getSalaryPerMonth() {
        return getPercentWorkedHours()*workRate/100;
    }
}
