package ASSIGNMENT4_1;

import java.time.LocalDate;

public class Secretary extends DeptEmployee{
    private double overtimeHours;

    public Secretary(String name,  int year, int month, int day, double salary) {
        super(name, LocalDate.of(year,month,day), salary);
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + 12*overtimeHours;
    }

/*
    public double getOvertimeHours() {
        return overtimeHours;
    }
*/

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
}
