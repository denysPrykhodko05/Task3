package entity;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(as = EmployeeJson.class)
public abstract class Employee {

    abstract public boolean setWorkRate(double workRate);

    abstract public boolean setWorkedHours(double workedHours);

    abstract public double getPercentWorkedHours();

    abstract public double getSalaryPerMonth();

}
