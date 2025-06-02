package ASSIGNMENT4_6.case2;

import java.util.GregorianCalendar;

public class PersonWithJob extends Person {
	private double salary;
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		super(name, dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}

	@Override
	public boolean equals(Object ob) {
		if (ob == null) return false;
		if (getClass() != ob.getClass()) return false;
		PersonWithJob p = (PersonWithJob) ob;
		return getName().equals(p.getName()) &&
				getDateOfBirth().equals(p.getDateOfBirth()) &&
				salary == p.salary;
	}
}
