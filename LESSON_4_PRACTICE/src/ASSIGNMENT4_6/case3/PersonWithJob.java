package ASSIGNMENT4_6.case3;

import java.util.GregorianCalendar;

public class PersonWithJob {
	private Person person;
	private double salary;

	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		this.person = new Person(name, dob);
		this.salary = salary;
	}

	public Person getPerson() {
		return person;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public boolean equals(Object ob) {
		if (ob == null) return false;
		if (getClass() != ob.getClass()) return false;
		PersonWithJob p = (PersonWithJob) ob;
		return person.equals(p.person) && salary == p.salary;
	}

	@Override
	public int hashCode() {
		return person.hashCode() + (int) salary * 31;
	}
}
