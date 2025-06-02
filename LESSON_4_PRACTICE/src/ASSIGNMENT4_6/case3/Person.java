package ASSIGNMENT4_6.case3;

import java.util.GregorianCalendar;

public class Person {

	private String name;
	private GregorianCalendar dateOfBirth;
	Person(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}
	public String getName() {
		return name;
	}
	
	public GregorianCalendar getDateOfBirth() {
		return (GregorianCalendar)dateOfBirth.clone();
	}

	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if (getClass() != ob.getClass()) return false;
		Person p = (Person)ob;
		return p.name.equals(name) && p.dateOfBirth.equals(dateOfBirth);
	}

	@Override
	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + name.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		return result;
	}
	
	public static void main(String[] args) {
		GregorianCalendar dob = new GregorianCalendar(1990, 1, 1);
		PersonWithJob pwj1 = new PersonWithJob("Alice", dob, 50000);
		PersonWithJob pwj2 = new PersonWithJob("Alice", dob, 70000);
		PersonWithJob pwj3 = new PersonWithJob("Alice", dob, 50000);
		Person p1 = new Person("Alice", dob);

		System.out.println("Case3: pwj1.equals(pwj2): " + pwj1.equals(pwj2)); // false
		System.out.println("Case3: pwj1.equals(pwj3): " + pwj1.equals(pwj3)); // true
		System.out.println("Case3: pwj1.equals(p1): " + pwj1.equals(p1)); // false
		System.out.println("Case3: p1.equals(pwj1): " + p1.equals(pwj1)); // false

	}

}
