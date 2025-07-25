package Assignment3_1;

import Assignment3_1.Util;

import java.time.LocalDate;

public class Employee {

	// instance fields
	private String name;
	private String nickName;
	private double salary;
	private LocalDate hireDay;

	// constructor
	Employee(String name, String aNickName, double aSalary, int aYear,
             int aMonth, int aDay) {
		this.name = name;
		nickName = aNickName;
		salary = aSalary;
		//GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
		hireDay = LocalDate.of(aYear, aMonth, aDay);
	}

	public String getName() {
		return name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String aNickName) {
		nickName = aNickName;
	}
	public double getSalary() {
		return salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	private String format = "name = %s, salary = %.2f, hireDay = %s";
	
	public String toString() {
		return String.format(format, name, salary, Util.dateAsString(hireDay));
	}
}
