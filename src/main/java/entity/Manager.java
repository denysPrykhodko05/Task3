package entity;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;


public class Manager extends Employee {
    private double workRate;
    private double workedHours;

    final int norm = 160;

    public boolean setWorkRate(double workRate) {
        this.workRate=workRate;
        return this.workRate!=0;
    }

    public boolean setWorkedHours(double workedHours) {
        this.workedHours=workedHours;
        return this.workedHours!=0;
    }

    public double getPercentWorkedHours() {
        return workedHours * 100 / norm;
    }

    public double getSalaryPerMonth() {
        if (getPercentWorkedHours()>=100){
            return workRate;
        }else {
            return getPercentWorkedHours()*workRate/100;
        }
    }
}
