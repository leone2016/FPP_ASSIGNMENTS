package ASSIGNMENT4_6.case1;

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

//	@Override
//	public boolean equals(Object withJob) {
//		if(withJob == null) return false;
//		if(!(withJob instanceof PersonWithJob))
//			return false;
//		PersonWithJob p = (PersonWithJob)withJob;
//		boolean isEqual= getName().equals(p.getName()) &&
//				this.salary == p.salary;
//		return isEqual;
//	}
}
